import java.util.Scanner;

public class ArrayExample0 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many values would you like to store: ");
		int size = scanner.nextInt();

		int[] values = new int[size];
		
		for (int index = 0; index < values.length; index++) {
			System.out.println("Enter value " + (index + 1) + ": ");
			values[index] = scanner.nextInt();
		}
		
		System.out.println("Here are the values you entered:  ");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		scanner.close();
	}

}
