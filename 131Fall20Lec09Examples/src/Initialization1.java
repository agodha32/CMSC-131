import java.util.Scanner;

public class Initialization1 {

	public static void main(String[] args) {
		
		int x = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();

		if (s.equals("dog")) {
			x = 10;
		}
		
		System.out.println("x is " + x);
		
		scanner.close();
	}

}
