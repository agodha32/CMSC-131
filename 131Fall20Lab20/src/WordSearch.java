import java.util.Random;

public class WordSearch {

	private char[][] table;
	private static Random random = new Random();

	/*
	 * Assigns to the "table" a two dimensional rectangular array with the specified
	 * number of rows and columns. Fills the array with random letters (A through
	 * Z).
	 * 
	 * Hint: The following expression returns a random letter (A-Z):
	 * (char)(random.nextInt(26) + 'A');
	 */
	public WordSearch(int rows, int cols) {

		table = new char[rows][cols];

		for (int row = 0; row < table.length; row++) {

			for (int col = 0; col < table[row].length; col++) {

				table[row][col] = (char) (random.nextInt(26) + 'A');

			}

		}

	}

	/*
	 * Displays the table on the console as a rectangular grid. Put one space after
	 * each letter so that it is spaced nicely.
	 */
	public void show() {

		for (int row = 0; row < table.length; row++) {

			for (int col = 0; col < table[row].length; col++) {

				System.out.print(table[row][col] + " ");

			}
			
			System.out.println();

		}

	}


	/*
	 * Places the given word in the table horizontally, with the first letter in
	 * position row, col.
	 * 
	 * The method should throw an IllegalArgumentException if any part of the word
	 * ends up off the table. NOTE: IF THE EXCEPTION IS THROWN, THE TABLE MUST NOT
	 * BE MODIFIED!
	 */
	public void hideWordHorizontally(String word, int row, int col) {

		if (word.length() > table[row].length  - col) {
			
			throw new IllegalArgumentException("Word placement is incorect!");
			
		} else {
			
			for (int length = 0; length < word.length(); length++) {
				
				char x = word.charAt(length);
				
				table[row][col + length] = x;
				
			}
			
		}
		
	}

	/*
	 * Places the given word in the table vertically, with the first letter in
	 * position row, col.
	 * 
	 * The method should throw an IllegalArgumentException if any part of the word
	 * ends up off the table. NOTE: IF THE EXCEPTION IS THROWN, THE TABLE MUST NOT
	 * BE MODIFIED!
	 */
	public void hideWordVertically(String word, int row, int col) {
		
		if (word.length() > table.length  - row) {
			
			throw new IllegalArgumentException("Word placement is incorect!");
			
		} else {
			
			for (int length = 0; length < word.length(); length++) {
				
				char x = word.charAt(length);
				
				table[row + length][col] = x;
				
			}
			
		}
		
	}

	/*
	 * Places the given word in the table diagonally (first letter at the upper
	 * left, last letter at the bottom right), with the first letter in position
	 * row, col.
	 * 
	 * The method should throw an IllegalArgumentException if any part of the word
	 * ends up off the table. NOTE: IF THE EXCEPTION IS THROWN, THE TABLE MUST NOT
	 * BE MODIFIED!
	 */
	public void hideWordDiagonally(String word, int row, int col) {

		if (word.length() > table.length  - row || 
				word.length() > table[row].length  - col) {
			
			throw new IllegalArgumentException("Word placement is incorect!");
			
		} else {
			
			for (int length = 0; length < word.length(); length++) {
				
				char x = word.charAt(length);
				
				table[row + length][col + length] = x;
				
			}
			
		}
		
	}

}
