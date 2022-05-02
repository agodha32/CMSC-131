import java.util.Scanner;

public class LogicalOps1 {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);

		System.out.print("Enter an integer from 1 to 10: ");
		int i = keyboardInput.nextInt();

		if (i >= 1 && i <= 10) {
			System.out.println("Good job!");
		} else {
			System.out.println("You didn't follow instructions!");
		}
		
		keyboardInput.close();
	}

}
