import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String response;
		do {
			System.out.println("I'm thinking of a number between");
			System.out.println("0 and 99.  Try to guess it...");
			int secretValue = random.nextInt(100);
			int guess;
			do {
				System.out.print("Guess: ");
				guess = scanner.nextInt();
				if (guess < secretValue) {
					System.out.println("No, the value is higher");
				} else if (guess > secretValue) {
					System.out.println("No, the value is lower");
				}
			} while (guess != secretValue);
			System.out.println("YES!  My value is " + secretValue);
			System.out.print("Would you like to play again (Y/N)?");
			response = scanner.next();
		} while (response.equals("Y"));
		scanner.close();
	}
}
