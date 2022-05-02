
public class Recursion1 {

	public static int sumFromOneToN(int n) {
		
		if(n == 1) {
		
			return 1;
			
		}
		
		return sumFromOneToN(n - 1) + n;
		
	}
	
	public static void main(String [] args) {
		
		System.out.println(sumFromOneToN(20));
		
	}

	
}
