import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SpeedComparison {

	public static void main(String[] args) {

		final int LIST_SIZE = 1000000;
		final int NUMBER_OF_RUNS = 1000;
		
		ArrayList<Integer> list = getRandomList(LIST_SIZE);
		Collections.sort(list);
		
		/* Time binary search first */
		long startTime = System.nanoTime();
		for (int i = 0; i < NUMBER_OF_RUNS; i++) {
			Integer element = getRandomElement(list);
			int index = Searching.binarySearch(list, element);
		}
		long endTime = System.nanoTime();
		double secondsElapsed = (endTime - startTime) / 1000000000.0;
		System.out.println("Time for binary search: " + secondsElapsed + " seconds");
		
		/* Time linear search */
		startTime = System.nanoTime();
		for (int i = 0; i < NUMBER_OF_RUNS; i++) {
			Integer element = getRandomElement(list);
			int index = Searching.linearSearch(list, element);
		}
		endTime = System.nanoTime();
		secondsElapsed = (endTime - startTime) / 1000000000.0;
		System.out.println("Time for linear search: " + secondsElapsed + " seconds");
	}

	private static Integer getRandomElement(List<Integer> a) {
		return a.get(random.nextInt(a.size()));
	}
	
	private static Random random = new Random();
	
	private static ArrayList<Integer> getRandomList(int LIST_SIZE) {
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < LIST_SIZE; i++) {
			a.add(random.nextInt());
		}
		return a;
	}
}
