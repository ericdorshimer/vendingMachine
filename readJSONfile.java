package vendingMachine;

import java.io.FileNotFoundException;

import org.json.simple.parser.JSONParser;

public class readJSONfile {

	
	public void JSONreader(int x) {
		JSONParser parser = new JSONParser();
		
		try
		{
			Object obj = parser.parse(new FileReader("input.json"));
			JSONObject jsonObject = (JSONObject) obj;
			
			JSONArray items = jsonObject.get("items");
			if(x >= items[8]) {
			String name = (String) jsonObject.get("name");
			int amount = jsonObject.get("amount");
			String price = jsonObject.get("price");
			// reading in all parts of the object ITEMS
			}
			
			
		}
		catch(FileNotFoundException e) {e.printStackTrace();}
		
	}
}
