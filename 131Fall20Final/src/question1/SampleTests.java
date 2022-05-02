package question1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class SampleTests {

	/* This test checks the return value with parameter 2.
	 * Your solution should by a 2D ragged array that looks like:
	 * 1
	 * 2 2
	 */
	@Test
	public void testArgumentIs2() {
		int[][] a = question1.TwoDArrayMaker.makeArray(2);
		assertTrue(a.length == 2);
		assertTrue(a[0].length == 1);
		assertTrue(a[1].length == 2);
		assertTrue(a[0][0] == 1);
		assertTrue(a[1][0] == 2);
		assertTrue(a[1][1] == 2);
	}

}
