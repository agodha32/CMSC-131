
public class BinarySearchExample {

	public static int binarySearch(Comparable[] a, Comparable value) {
		return helper(a, value, 0, a.length - 1);
	}
	
	private static int helper(Comparable[] a, Comparable value, int low, int high) {
		if (low > high) {
			throw new RuntimeException("Not found!");
		}
		int middleIndex = (low + high) / 2;
		int result = a[middleIndex].compareTo(value);
		if (result == 0) {
			return middleIndex;
		} else if (result < 0) {
			return helper(a, value, middleIndex + 1, high);
		} else {
			return helper(a, value, low, middleIndex - 1);
		}
	}
	
	
	public static void main(String[] args) {

		Integer[] test = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
		System.out.println(binarySearch(test, 13));
	}

}
