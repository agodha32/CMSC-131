import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scanner.next();

		if (name.length() <= 4) {
			System.out.print("Your name is kind of short... ");
			System.out.println("I'll fix it.");
			name = name + ", the Great";
		}
		System.out.println("The length of the name is " + name.length());	
		scanner.close();
	}

}
