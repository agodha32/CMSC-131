import java.util.Scanner;

public class DiagonalExample2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = s.nextInt();
		int currNumXs = 1;
		int currNumOs = size - 1;
		for (int row = 0; row < size; row = row + 1) {
			/* print some X's */
			for (int col = 0; col < currNumXs; col = col + 1) {
				System.out.print("X");
			}
			/* print some O's */
			for (int col = 0; col < currNumOs; col = col + 1) {
				System.out.print("O");
			}
			/* move to next line of output */
			System.out.println();
			currNumXs = currNumXs + 1;
			currNumOs = currNumOs - 1;
		}
	}
}


