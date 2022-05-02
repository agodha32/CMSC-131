
import java.util.Scanner;

public class Interview {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is your name: ");
		String name = keyboard.next();

		System.out.print("What is your age: ");
		int age = keyboard.nextInt();

		System.out.print("How many months has it been since your last birthday: ");
		int months = keyboard.nextInt();
		keyboard.nextLine();

		int ageInMonths = (age * 12) + months;

		System.out.print("What is your favorite class: ");
		String favClass = keyboard.nextLine();

		if (ageInMonths > 900) {
			System.out.println("Hello " + name + ", you are old. Your age is " + ageInMonths + " months.");
		} else if (ageInMonths < 120) {
			System.out.println("Hello " + name + ", you are quite young. Your age is " + ageInMonths + " months.");
		} else {
			System.out.println("Hello " + name + ". Your age is " + ageInMonths + " months.");
		}

		System.out.println("Yes, " + favClass + " is a great class!");

		keyboard.close();

	}

}
