
public class FibonacciWithDynamicProgramming {

	static long[] fibArray = new long[1000];
	
	public static long fib(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (fibArray[n] != 0) {
			return fibArray[n];
		}
		long value = fib(n - 1) + fib(n - 2);
		fibArray[n] = value;
		return value;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 80; i++) {
			System.out.println(i + ":  " + fib(i));
		}
	}
}
