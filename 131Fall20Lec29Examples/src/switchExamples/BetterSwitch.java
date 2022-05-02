package switchExamples;

import javax.swing.JOptionPane;

public class BetterSwitch {

		public static void main(String[] args) {
			
			String digitString = JOptionPane.showInputDialog("Enter a single digit.");
			int digit = Integer.parseInt(digitString);
			
			int mysteryValue = 0;
			
			switch(digit) {
			case 0:
			case 4:
			case 5:
			case 9:
				mysteryValue = 4;
				break;
			case 1:
			case 2:
			case 6:
				mysteryValue = 3;
				break;
			case 3:
			case 7:
			case 8:
				mysteryValue = 5;
				break;
			default:
				throw new RuntimeException("Illegal Value: " + digit);
			}
			System.out.println("Mystery value is " + mysteryValue);
		}
	

}
