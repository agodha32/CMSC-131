package question4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class SampleTests {

	@Test
	public void test() {
		int[] a = {7, 1, 7, 2, 7};
		
		/* There are three 7's in the array, so return value should be 3 */
		assertTrue(SevenCounter.countSevens(a) == 3);
	}

}
