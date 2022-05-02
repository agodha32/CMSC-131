
public class FibonacciRecursiveVersion {

	public static long fib(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 80; i++) {
			System.out.println(i + ":  " + fib(i));
		} 
		
	}
}
