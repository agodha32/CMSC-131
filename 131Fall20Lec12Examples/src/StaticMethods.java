
public class StaticMethods {

	public static void printChars(int numChars, char symbol) {
		for (int col = 0; col < numChars; col = col + 1) {
			System.out.print(symbol);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printRectangle(10, 20, '&');
		printTriangle(15, '%');
		System.out.println("DONE!");
	}

	public static void printRectangle(int width, int height, char symbol) {
		for (int row = 0; row < height; row = row + 1) {
			printChars(width, symbol);
		}
	}
	
	public static void printTriangle(int size, char symbol) {
		for (int row = 0; row < size; row = row + 1) {
			printChars(row + 1, symbol);
		}
	}
}
