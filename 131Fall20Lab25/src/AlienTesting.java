import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class AlienTesting {

	private static Random random = new Random();

	@Test
	public void testReverseString() {
		// reverse 100 randomly generated strings and check if it works right
		for (int count = 0; count < 100; count++) {
			String s = AlienDatabase.makeRandomString();
			String s2 = Alien.reverseString(s);
			assertTrue(s.length() == s2.length());
			for (int i = 0; i < s.length(); i++) {
				assertTrue(s.charAt(i) == s2.charAt(s2.length() - i - 1));
			}
		}
	}


	@Test
	public void testAlien() {
		// instantiate 100 aliens
		ArrayList<Alien> aliens = new ArrayList<Alien>();
		for (int i = 0; i < 100; i++) {
			int numHeads = random.nextInt(10) + 1;
			String name = AlienDatabase.makeRandomString();
			aliens.add(new Alien(numHeads, name));
		}
		Collections.sort(aliens);
		for(int i = 0; i < aliens.size() - 1; i++) {
			System.out.println(aliens.get(i).getName());
			String name1 = Alien.reverseString(aliens.get(i).getName());
			String name2 = Alien.reverseString(aliens.get(i + 1).getName());
			assertTrue(name1.compareTo(name2) < 0);	
		}

	}

}
