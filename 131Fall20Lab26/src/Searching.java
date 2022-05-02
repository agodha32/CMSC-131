import java.util.ArrayList;
import java.util.List;

public class Searching {

	/*
	 * Returns the index of numberToFind (where it is in the list). Throws an
	 * illegal argument exception if numberToFind is not in the list.
	 */
	public static int linearSearch(ArrayList<Integer> list, Integer numberToFind) {


		for (int x = 0; x < list.size(); x++) {

			if (list.get(x) == numberToFind) {

				return x;
				
			}

		}

		throw new IllegalArgumentException("Number not in the List");

	}

	/*
	 * Returns the index of numberToFind (where it is in the list) Pre-condition:
	 * The list is sorted. Throws an IllegalArgumentException if numberToFind is not
	 * in the list.
	 */
	public static int binarySearch(ArrayList<Integer> list, Integer numberToFind) {

		int x = 0, y = list.size() - 1;


		while (x <= y) {
			
			int mid = (x + y)  / 2;
			
			if (list.get(mid) == numberToFind) {
				
				return mid;
				
			} else if (list.get(mid) < numberToFind) {
				
				x = mid + 1;
				
			} else {
				
				y = mid - 1;
				
			}

		}
			
		throw new IllegalArgumentException();

	}

}
