
public class Recursion3 {
	
	public static int sumOfDigits(int n) {
		
		if(n == 0) {
			
			return 0;
			
		}
		
		return sumOfDigits(n / 10) + (n % 10);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(sumOfDigits(123455));
		
	}

	
}
