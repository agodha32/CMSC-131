import java.util.Scanner;

public class multiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number:" );
		int newNum = input.nextInt();

		
		for (int col = 0; col < newNum; col = col + 1) {
			
			System.out.println("");
			
			for (int row = 0; row < newNum; row = row + 1) {
				int x = row + 1;
				System.out.print(x * (col + 1));
				
			}
			
		}
		
		input.close();
	}
}
