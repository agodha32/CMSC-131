package question2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class SampleTests {

	@Test
	public void testBasicEquals() {
		WordSet set1 = new WordSet();  // set containing "x" and "y"
		set1.words.add("x");
		set1.words.add("y");
		WordSet set2 = new WordSet();  // same elements, but added backwards
		set2.words.add("y");
		set2.words.add("x");
		WordSet set3 = new WordSet();  // different set with just "x"
		set3.words.add("x");
		assertTrue(set1.equals(set2));  // order doesn't matter
		assertFalse(set1.equals(set3)); // these sets are not the same
	}
	
	@Test
	public void testBasicCopyConstructor() {

		
		
		WordSet set1 = new WordSet();
		set1.words.add("x");
		WordSet set2 = new WordSet(set1);
		assertTrue(set1 != set2);
		assertTrue(set2.words.size() == 1);
		assertTrue(set2.words.get(0).equals("x"));
		
	}
}
