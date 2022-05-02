import java.util.Scanner;

public class Cascading1 {

	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);

		System.out.println("Enter three integers and I will tell you which is smallest: ");
		int a = keyboardScanner.nextInt();
		int b = keyboardScanner.nextInt();
		int c = keyboardScanner.nextInt();

		if (a < b && a < c) {
			System.out.println(a + " is the smallest");
		} else if (b < a && b < c) {
			System.out.println(b + " is the smallest");
		} else {
			System.out.println(c + " is the smallest");
		}
		
		keyboardScanner.close();
	}

}
