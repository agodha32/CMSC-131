import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.Test;

import junit.framework.TestCase;

public class SearchTests extends TestCase {

	private static final int SIZE = 1000;
	private static Random random = new Random();
	
	@Test
	public static void testLinearSearch() {
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < SIZE; i++) {
			a.add(random.nextInt());
		}
		for (int i = 0; i < SIZE; i++) {
			Integer toFind = a.get(i);
			int location = Searching.linearSearch(a, toFind);
			assertEquals(i, location);
		}
	}
	
	@Test
	public static void testBinarySearch() {
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < SIZE; i++) {
			a.add(random.nextInt());
		}
		Collections.sort(a);
		for (int i = 0; i < SIZE; i++) {
			Integer toFind = a.get(i);
			int location = Searching.binarySearch(a, toFind);
			assertEquals(i, location);
		}
	}
}