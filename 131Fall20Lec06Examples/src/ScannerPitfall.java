import java.util.Scanner;

public class ScannerPitfall {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = myScanner.nextInt();
		System.out.println("What is your name?");
		String name = myScanner.nextLine();
		System.out.println("What is your shoe size?");
		double shoeSize = myScanner.nextDouble();
		myScanner.close();
	}

}
