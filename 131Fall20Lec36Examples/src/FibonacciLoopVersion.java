
public class FibonacciLoopVersion {

	public static long fib(int n) {
		if (n < 2) {
			return 1;
		}
		long curr = 2, prev = 1, prevPrev = 1;
		for (int i = 1; i < n; i++) {
			curr = prev + prevPrev;
			prevPrev = prev;
			prev = curr;
		}
		return curr;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 80; i++) {
			System.out.println(i + ":  " + fib(i));
		}
	}

}
