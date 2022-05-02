import java.util.Scanner;

public class DiagonalExample3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = s.nextInt();
		
		for (int row = 0; row < size; row = row + 1) {
			for (int col = 0; col < size; col = col + 1) {
				if (row >= col) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}
			}
			System.out.println();
		}
	}

}
