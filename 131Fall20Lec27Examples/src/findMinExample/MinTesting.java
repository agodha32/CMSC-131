package findMinExample;
import static org.junit.Assert.*;

import org.junit.Test;

public class MinTesting {

	@Test
	public void testIntegerFindMin() {
		Integer[] a = {7, 2, -4, 8, 9, 3};
		Integer smallest = (Integer)MinFinder.findMin(a);
		assertTrue(smallest == a[2]);
	}
	
	@Test
	public void testStringFindMin() {
		String[] a = {"hello", "goodbye", "aardvark", "whatevr"};
		assertTrue(MinFinder.findMin(a) == a[2]);
	}
	
	
	

}
