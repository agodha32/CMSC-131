import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Width: ");
		int width = scanner.nextInt();
		System.out.print("Height: ");
		int height = scanner.nextInt();
		for (int row = 0; row < height; row = row + 1) {
			for (int col = 0; col < width; col = col + 1) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
