import java.util.Scanner;

public class Driver {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		WordSearch ws = new WordSearch(10, 20);
		while(true) {
			System.out.println();
			ws.show();
			System.out.println();

			boolean badInput;
			do {
				badInput = false;
				System.out.print("Enter word to hide: ");
				String word = scanner.next();
				System.out.print("Row? ");
				int row = scanner.nextInt();
				System.out.print("Column? ");
				int col = scanner.nextInt();
				System.out.print("Enter 1 for horizontal, 2 for vertical, 3 for diagonal: ");
				int choice = scanner.nextInt();
				try {
					if (choice == 1) {
						ws.hideWordHorizontally(word, row, col);
					} else if (choice == 2) {
						ws.hideWordVertically(word, row, col);
					} else {
						ws.hideWordDiagonally(word, row, col);
					}
				} catch (IllegalArgumentException e) {
					System.out.println("WORD WOULD BE OFF THE TABLE! Try again.");
					badInput = true;
				}
			} while(badInput);
		}
	}

}
