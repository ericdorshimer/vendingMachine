package vendingMachine;

import java.awt.LayoutManager;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class vendingMachine extends JFrame {
	JFrame machine = new JFrame();
	JTextArea displayArea = new JTextArea();
	JPanel itemSelectArea = new JPanel(new GridLayout(4, 8));
	
	public vendingMachine() {
		machine.setTitle("Eric's Vending Machine");
		machine.setSize(500,600);
		machine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		machine.setLayout(new BorderLayout());
		machine.setVisible(true);
		
		displayArea.setEditable(false);
		machine.add(displayArea, BorderLayout.NORTH);
		machine.add(itemSelectArea, BorderLayout.CENTER);
	}
	public void selectItems() {
		this.itemSelectArea = new JPanel();
		JButton one = new JButton(readJSONfile.JSONreader(0));
		one.addActionListener(new DigitsListener());
		
		JButton two = new JButton(readJSONfile.JSONreader(1));
		two.addActionListener(new DigitsListener());
		
		JButton three = new JButton(readJSONfile.JSONreader(2));
		three.addActionListener(new DigitsListener());
		
		JButton four = new JButton(readJSONfile.JSONreader(3));
		four.addActionListener(new DigitsListener());
		
		JButton five = new JButton(readJSONfile.JSONreader(4));
		five.addActionListener(new DigitsListener());
		
		JButton six = new JButton(readJSONfile.JSONreader(5));
		six.addActionListener(new DigitsListener());
		
		JButton seven = new JButton(readJSONfile.JSONreader(6));
		seven.addActionListener(new DigitsListener());
		
		JButton eight = new JButton(readJSONfile.JSONreader(7));
		eight.addActionListener(new DigitsListener());
		
		JButton nine = new JButton(readJSONfile.JSONreader(8));
		nine.addActionListener(new DigitsListener());
		
		
		this.itemSelectArea.add(one);
		this.itemSelectArea.add(two);
		this.itemSelectArea.add(three);
		this.itemSelectArea.add(four);
		this.itemSelectArea.add(five);
		this.itemSelectArea.add(six);
		this.itemSelectArea.add(seven);
		this.itemSelectArea.add(eight);
		this.itemSelectArea.add(nine);


		//END OF CREATE BUTTON PANEL
	}
	public void displayPayment() {
		
	}
	public void calcPayment(int money) {
		
	}
	
}
