
public class Recursion2 {
	
	public static int multiply(int a, int b) {
		
		if(b == 0) {
			
			return 0;
			
		}
		
		return multiply(a, b - 1) + a;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(multiply(15,20));
		
	}

	
}
