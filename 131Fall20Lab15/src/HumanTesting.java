import static org.junit.Assert.*;

import org.junit.Test;

public class HumanTesting {

	/* Copy and paste the link below into a browser.  This is
	 * the documentation for a class called "Human":
	 *  
	 * http://www.cs.umd.edu/~fpe/131/Human/
	 * 
	 * The Human class is already in this project (in a jar file, 
	 * so you can't see the code).  You will test the Human
	 * class by adding your own JUnit tests, below. 
	 * 
	 * The only components of the Human class that
	 * are *NOT* broken are the constructor that takes
	 * three parameters and the getters.  Don't 
	 * bother writing tests for these.
	 * 
	 * Write a JUnit test for each of the other features
	 * of the Human class (including the setter, the copy 
	 * constructor, the equals method, and all of the other
	 * methods).  They are all buggy!  Try to find cases 
	 * that illustrate failures for all of them.
	 */
	
	
	/* We're including this one just to remind you how
	 * JUnit tests are written.
	 */
	@Test
	public void testGetName() {
		Human a = new Human("Fred", 22, 68);
		String name = a.getName();
		assertTrue(name.equals("Fred"));
	}
	
	@Test
	public void testGetAge() {
		Human a = new Human("Fred", 22, 68);
		assertTrue(a.getAge()==22);
	}
	
	@Test
	public void testCopyConstructor() {
		Human a = new Human("Fred", 22, 68);
		Human b = new Human(a);
		assertFalse(a.getName()==b.getName());
		assertTrue(a.getAge()==b.getAge());
		assertTrue(a.getHeight()==b.getHeight());
		assertTrue((a.getName()).equals(b.getName()));
	}
	
	@Test
	public void testSetName() {
		Human a = new Human("Fred", 22, 68);
		a.setName("dumbass");
		assertFalse(a.getName()=="dumbass");
		assertTrue(a.getName().equals("dumbass"));
	}
	
	@Test
	public void testEquals() {
		Human a = new Human("Fred", 22, 68);
		Human b = new Human("Fred", 22, 68);
		Human c = new Human("Fred", 23, 68);
		Human d = new Human("Fred", 22, -68);
		assertTrue(a.equals(b));
		assertFalse(b.equals(c));
		assertFalse(c.equals(d));
	}
	
	@Test
	public void testWhoIsTaller() {
		Human a = new Human("Fred", 22, 68);
		Human b = new Human("Fred", 22, 69);
		assertTrue(b==a.whoIsTaller(a, b));
		assertFalse(a.equals(a.whoIsTaller(a, b)));
		assertTrue(b.equals(a.whoIsTaller(a, b)));
	} 
	
	@Test
	public void testReverseName() {
		Human a = new Human("Fred", 22, 68);
		a.reverseName();
		assertTrue((a.getName()).equals("derF"));
		a.setName("11");
		assertTrue((a.getName()).equals("11"));
		a.setName("Fred Rallison");
		assertTrue((a.getName()).equals("nosillaR derF"));
		assertTrue((a.getName()).equals("Fred"));
		a.setName("Fred ");
		assertTrue((a.getName()).equals(" derF"));
	}
	
	@Test
	public void testAddToHeight() {
		Human a = new Human("Fred", 22, 68);
		a.addToHeight(4);
		assertTrue(a.getHeight()==72);
		a.addToHeight(-4);
		assertTrue(a.getHeight()==68);
		a.addToHeight(0);
		assertTrue(a.getHeight()==68);
	}

}
