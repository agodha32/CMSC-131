package findMinExample;


public class MinFinder {
	
	public static Comparable findMin(Comparable[] a) {
		Comparable smallestSoFar = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i].compareTo(smallestSoFar) < 0) {
				smallestSoFar = a[i];
			}
		}
		return smallestSoFar;
	}
	
	
}
