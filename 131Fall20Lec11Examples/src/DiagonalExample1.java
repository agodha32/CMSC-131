import java.util.Scanner;

public class DiagonalExample1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = s.nextInt();
		for (int row = 0; row < size; row = row + 1) {
			/* print some X's */
			for (int col = 0; col < row + 1; col = col + 1) {
				System.out.print("X");
			}
			/* print some O's */
			for (int col = 0; col < size - 1 - row; col = col + 1) {
				System.out.print("O");
			}
			/* move to next line of output */
			System.out.println();
		}
		
	}
}


