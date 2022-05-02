import java.util.Random;

public class BetterNumberList {

	private int[] values;
	private Random random = new Random();

	/*
	 * Instantiates the object as a list of 5 random values.
	 * 
	 * Your code should assigns to the variable "values" an array of size n. Then
	 * fill the array with n random values between 0 and 99.
	 * 
	 * Hint: Recall that the following expression returns a random number between 0
	 * and 99: random.nextInt(100)
	 */
	public BetterNumberList(int n) {

		values = new int[n];

		for (int num = 0; num < values.length; num++) {

			values[num] = random.nextInt(100);

		}

	}

	/*
	 * Returns a DEEP copy of the array. (Arrays in Java are always mutable, so a
	 * deep copy is best.) Don't cheat and call any of the built in methods that
	 * make copies of arrays.
	 * 
	 * Hint: If there is no loop, it's not a deep copy in this case.
	 */
	public int[] getList() {

		int newList[] = new int[values.length];

		for (int num = 0; num < values.length; num++) {

			newList[num] = values[num];

		}

		return newList;

	}

	/*
	 * Inserts the given element into the array at the specified position. If the
	 * parameter is less than 0 or more than the length of the array, then this
	 * method must throw an IllegalArgumentException.
	 * 
	 * Hint: Inserting is hard! You have to make a new array that is larger, and
	 * then copy everything from the old array to the new, leaving a gap for the
	 * element to be inserted. Don't forget to re-assign the variable "values" to
	 * the new array at the end.
	 * 
	 * Examples:
	 * 
	 * * If the array is [1, 2, 3], inserting 77 at position 0 yields [77, 1, 2, 3]
	 * * If the array is [1, 2, 3], inserting 77 at position 1 yields [1, 77, 2, 3]
	 * [1,2,3,0] * If the array is [1, 2, 3], inserting 77 at position 3 yields [1,
	 * 2, 3, 77]
	 */
	public void insert(int element, int position) {

		int temp[] = new int[values.length + 1];
		int x = 0;

		if (position < 0 || position > temp.length) {

			throw new IllegalArgumentException("Index does not exist.");

		} else {

			for (int num = 0; num < values.length; num++) {

				if (num != position) {

					temp[x] = values[num];
					x++;
					
				} else {
					
					temp[x] = element;
					
				}	

			}

			temp[position] = element;

		}
		
		values = temp;

	}

	/*
	 * Removes all copies of the specified element from the array.
	 * 
	 * Example: * If the array is [7, 1, 7, 7, 2, 3, 7] then removeAll(7) would
	 * yield [1, 2, 3]
	 */
	public void removeAll(int element) {

		int counter = 0;

		for (int num = 0; num < values.length; num++) {

			if (values[num] == element) {

				counter++;

			}

		}

		int[] temp = new int[values.length - counter];

		int totalCount = 0;

		for (int num = 0; num < values.length; num++) {

			if (values[num] != element) {

				temp[totalCount] = values[num];

				totalCount++;
			}
		}

		values = temp;

	}

	/*
	 * Sort the array from least to greatest. DON'T GOOGLE IT!! You can figure this
	 * out even if you've never seen a sorting algorithm before. Think about it and
	 * see if you can pull it off!
	 * 
	 * Example: * If the array is [5, 2, 1, 4, 3] then calling mySort results in [1,
	 * 2, 3, 4, 5]
	 */
	public void mySort() {

		int counter = 0;

		for (int num = 0; num < values.length; num++) {

			for (int x = 0; x < values.length - 1 - counter; x++) {

				if (values[x] > values[x + 1]) {

					int temp = values[x];

					values[x] = values[x + 1];

					values[x + 1] = temp;
				}
			}

			counter++;
		}

	}

}
