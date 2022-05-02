
public class ExponentiationRecursiveVersion {

	public static int power(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		return power(base, exponent - 1) * base;
	}
	
	public static void main(String[] args) {
		System.out.println(power(2, 10));
	}
}
