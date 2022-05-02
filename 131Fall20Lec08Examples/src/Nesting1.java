import java.util.Scanner;

public class Nesting1 {

	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int i = keyboardScanner.nextInt();

		if (i < 0) {
			System.out.println("I don't like negative numbers!");
			if (i < -100) {
				System.out.println("Also... that one is REALLY negative!");
			}
		} else {
			if (i < 100) {
				System.out.println("That's a pretty small number.");
			} else { 
				System.out.println("That's a nice big number!");
			}
		}		
		keyboardScanner.close();
	}

}
