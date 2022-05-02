import java.util.Scanner;

public class EqualityWithObjects {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = myScanner.next();
		System.out.println("Enter another String:");
		String s2 = myScanner.next();
		System.out.println(s1.equals(s2));
		myScanner.close();
	}

}
