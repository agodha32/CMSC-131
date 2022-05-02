
public class SumExample {

	public static int sum(int[] a) {
		return sumHelper(a, 0);
	}
	
	private static int sumHelper(int[] a, int pos) {
		if (pos == a.length) {
			return 0;
		}
		int partAnswer = sumHelper(a, pos + 1);
		return a[pos] + partAnswer;
	}
	
}
