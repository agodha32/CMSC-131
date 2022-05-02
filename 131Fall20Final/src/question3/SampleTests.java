package question3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Test;

import question2.WordSet;

public class SampleTests {

	@Test
	public void test() {
		WordSet set1 = new WordSet();   // set with "A" and "B"
		set1.words.add("A");
		set1.words.add("B");
		WordSet set2 = new WordSet();   // set with "B" and "C"
		set2.words.add("B");
		set2.words.add("C");
		ArrayList<WordSet> list = new ArrayList<>();
		list.add(set1);
		list.add(set2);
		WordSet union = WordSetUnion.union(list);  
		
		/* union should be a set containing "A", "B", and "C"
		 * with no duplicates. */
		assertTrue(union.words.contains("A"));
		assertTrue(union.words.contains("B"));
		assertTrue(union.words.contains("C"));
		assertTrue(union.words.size() == 3);    // no duplicates
	}

}
