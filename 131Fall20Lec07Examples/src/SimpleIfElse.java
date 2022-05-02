import java.util.Scanner;

public class SimpleIfElse {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter a non-negative integer: ");
		int value = myScanner.nextInt();
		
		if (value >= 0) {
			System.out.println("Thanks for reading the instructions.");
			System.out.println("Great job!");
		} else {
			System.out.println("You didn't follow instructions!");
			value = -value;
		}
		System.out.println("Non-negative number: " + value);
		myScanner.close();
	}
	
}