import java.util.Scanner;

public class GiantBinary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the size of 0 and 1 you want: ");
		int size = input.nextInt();
		
		System.out.print("Please entera number between 0 and 255: ");
		int n = input.nextInt();
		System.out.println("");
		
		drawBinary(n, size);
		
		input.close();
	}

	public static void drawZero(int size) {
				
		for (int counter = 0; counter < 3; counter++) {
		
			for (int printed = 0; printed < size; printed++) {
			
				System.out.print("0");		
			
			}
		
		System.out.println("");
			
		}
		
		for (int counter = 0; counter < (size - 6); counter++) {
			
			System.out.print("000");
			
			for (int spaces = 0; spaces < (size - 6); spaces++) {
				
				System.out.print(" ");
				
			}
			
			System.out.println("000");

		}
		
		for (int counter = 0; counter < 3; counter++) {
			
			for (int printed = 0; printed < size; printed++) {
			
				System.out.print("0");		
			
			}
		
		System.out.println("");
			
		}
		
		
		System.out.println("");
	}
	
	public static void drawOne(int size) {
		
		for (int printed = 0; printed < size; printed++) {
			
			System.out.println("111");		
			
		}
		
		System.out.println("");
			
		}
	
	public static void drawBinary(int n, int size) {
		
		if (n == 0) {
			
			drawZero(size);
			
		}
		
		while (n > 0) {
			int digit = n % 2;
			if (digit == 0) {
				
				drawZero(size);
				
			} else {
				
				drawOne(size);
				
			}
			
			n = n / 2;
		}
	}
	
	
}
