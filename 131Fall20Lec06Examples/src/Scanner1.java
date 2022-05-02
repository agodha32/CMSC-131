import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
		
		int first, second;
		
		System.out.print("Enter an integer: ");
		first = keyboardInput.nextInt();
		System.out.print("Enter another integer: ");
		second = keyboardInput.nextInt();
		
		System.out.println("The first number you entered was " + first);
		System.out.println("The second number you entered was " + second);
		
		int sum = first + second;
		int product = first * second;
		System.out.println("Their sum is " + sum);
		System.out.println("Their product is " + product);
		
		keyboardInput.close();
	}

}
