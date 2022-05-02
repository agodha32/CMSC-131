package switchExamples;

import javax.swing.JOptionPane;

public class PlainSwitch {

	public static void main(String[] args) {
		
		String digitString = JOptionPane.showInputDialog("Enter a single digit.");
		int digit = Integer.parseInt(digitString);
		
		int mysteryValue = 0;
		
		switch(digit) {
		case 0:
			mysteryValue = 4;
			break;
		case 1:
			mysteryValue = 3;
			break;
		case 2:
			mysteryValue = 3;
			break;
		case 3:
			mysteryValue = 5;
			break;
		case 4:
			mysteryValue = 4;
			break;
		case 5:
			mysteryValue = 4;
			break;
		case 6:
			mysteryValue = 3;
			break;
		case 7:
			mysteryValue = 5;
			break;
		case 8:
			mysteryValue = 5;
			break;
		case 9:
			mysteryValue = 4;
			break;
		default:
			throw new RuntimeException("Illegal value: " + digit);
		}
		System.out.println("Mystery value is " + mysteryValue);
	}
}
