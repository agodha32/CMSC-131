import java.util.Scanner;

public class reverseinteger {
	public static void main(String[] args) {
		
		int reverse = 0; 
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = input.nextInt();
		
		while (number != 0) {
			
			reverse = reverse * 10;
			reverse = reverse + number%10;
			number = number / 10;
			
		}
		System.out.print(reverse);
		input.close();
		
	}
	
}
