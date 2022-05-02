
public class FactorialLoopVersion {

	public static int factorial(int n) {
		int product = 1;
		for (int factor = 2; factor <= n; factor++) {
			product *= factor;
		}
		return product;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}
