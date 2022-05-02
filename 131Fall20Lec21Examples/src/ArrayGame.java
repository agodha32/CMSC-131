import java.util.Random;
import java.util.Scanner;

public class ArrayGame {

	public static void main(String[] args) throws InterruptedException {
		
		final int DELAY_MS = 500;
		final int MAX_VALUES = 1000;
		final int BLANK_LINES = 100;

		Scanner scanner = new Scanner(System.in);
		Random randomGenerator = new Random();

		/* Create and initialize array */
		int[] values = new int[MAX_VALUES];
		for (int i = 0; i < values.length; i++) {
			values[i] = randomGenerator.nextInt(10);
		}

		/* Play the game */
		System.out.println("Press enter when ready...");
		scanner.nextLine();
		
		int numValuesToShow = 1;
		boolean gameOver = false;
		while (!gameOver) {
			
			System.out.println();
			System.out.println();
			
			/* Show values slowly */
			for (int index = 0; index < numValuesToShow; index++) {
				System.out.print(values[index] + "  ");
				Thread.sleep(DELAY_MS);
			}

			/* Print blank lines quickly */
			for (int i = 0; i < BLANK_LINES; i++) {
				System.out.println();
			}

			/* Get user inputs */
			for (int index = 0; index < numValuesToShow; index++) {
				System.out.print("Value ?  ");
				int response = scanner.nextInt();
				if (response != values[index]) {
					System.out.println("\n\nWRONG!\n\n");
					gameOver = true;
					break;
				}
			}
			numValuesToShow++;
		}
		scanner.close();
	}

}
