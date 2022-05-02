import static org.junit.Assert.*;

import org.junit.Test;


public class PublicTests {

	@Test
	public void testBasicConstructorsAndGetters() {
		
		MyDouble a = new MyDouble(5.7), b = new MyDouble(-3.7);
		MyDouble d = new MyDouble(555.729);
		
		ComplexNumber x = new ComplexNumber(a, b);
		assertTrue(x.getReal().compareTo(a) == 0 && x.getImag().compareTo(b) == 0);
		
		ComplexNumber z = new ComplexNumber(d);
		assertTrue(z.getReal().compareTo(d) == 0 && z.getImag().compareTo(new MyDouble(0)) == 0);
	}
	
	@Test
	public void testCopyConstructor() {
		
		MyDouble a = new MyDouble(5.7), b = new MyDouble(-3.7);
		
		ComplexNumber x = new ComplexNumber(a, b);
		ComplexNumber y = new ComplexNumber(x);
		assertTrue(x != y);     // Check to be sure they are not aliased!
		assertTrue(y.getReal().compareTo(a) == 0 && y.getImag().compareTo(b) == 0);
	}
	
	@Test
	public void addComplexNumber() {
		
		MyDouble a = new MyDouble(1.2), b = new MyDouble(5.6);
		MyDouble c = new MyDouble(2.3), d = new MyDouble(-6.7);
		MyDouble e = new MyDouble(3.5), f = new MyDouble(-1.1);
		MyDouble g = new MyDouble(6), h = new MyDouble(12);
		MyDouble i = new MyDouble(3), j = new MyDouble(-6);
		MyDouble k = new MyDouble(9.0), l = new MyDouble(6.0);
		
		ComplexNumber x = new ComplexNumber(a, b); // creates a complex number
		ComplexNumber y = new ComplexNumber(c, d); // creates a complex number
		ComplexNumber z = new ComplexNumber(e, f); // creates a complex number
		ComplexNumber an = new ComplexNumber(g, h); // creates a complex number
		ComplexNumber bn = new ComplexNumber(i, j); // creates a complex number
		ComplexNumber cn = new ComplexNumber(k, l); // creates a complex number
		
		ComplexNumber ran = x.add(y);
		ComplexNumber dom = an.add(bn);

		// checks if the addition is calculated correctly
		assertTrue(ran.compareTo(z) == 0);
		assertTrue(dom.compareTo(cn) == 0);
	}

	@Test
	public void subtractComplexNumber() {
		
		MyDouble a = new MyDouble(1.2), b = new MyDouble(5.6);
		MyDouble c = new MyDouble(2.3), d = new MyDouble(-6.7);
		MyDouble e = new MyDouble(-1.1), f = new MyDouble(12.3);
		MyDouble g = new MyDouble(6), h = new MyDouble(12);
		MyDouble i = new MyDouble(3), j = new MyDouble(-6);
		MyDouble k = new MyDouble(3.0), l = new MyDouble(18.0);
		
		
		ComplexNumber x = new ComplexNumber(a, b); // creates a complex number
		ComplexNumber y = new ComplexNumber(c, d); // creates a complex number
		ComplexNumber z = new ComplexNumber(e, f); // creates a complex number
		ComplexNumber an = new ComplexNumber(g, h); // creates a complex number
		ComplexNumber bn = new ComplexNumber(i, j); // creates a complex number
		ComplexNumber cn = new ComplexNumber(k, l); // creates a complex number
		
		ComplexNumber ran = x.subtract(y);
		ComplexNumber dom = an.subtract(bn);
		
		// checks if the subtraction is calculated correctly
		assertTrue(ran.compareTo(z) == 0);
		assertTrue(dom.compareTo(cn) == 0);
		
	}
	
	@Test
	public void multiplyComplexNumber() {
		
		MyDouble a = new MyDouble(1.2), b = new MyDouble(5.6);
		MyDouble c = new MyDouble(2.3), d = new MyDouble(-6.7);
		MyDouble e = new MyDouble(40.28), f = new MyDouble(4.84);
		MyDouble g = new MyDouble(6), h = new MyDouble(12);
		MyDouble i = new MyDouble(3), j = new MyDouble(-6);
		MyDouble k = new MyDouble(90.0), l = new MyDouble(0.0);
		
		ComplexNumber x = new ComplexNumber(a, b); // creates a complex number
		ComplexNumber y = new ComplexNumber(c, d); // creates a complex number
		ComplexNumber z = new ComplexNumber(e, f); // creates a complex number
		ComplexNumber an = new ComplexNumber(g, h); // creates a complex number
		ComplexNumber bn = new ComplexNumber(i, j); // creates a complex number
		ComplexNumber cn = new ComplexNumber(k, l); // creates a complex number
		
		ComplexNumber ran = x.multiply(y);
		ComplexNumber dom = an.multiply(bn);
		
		// checks if the multiplication is calculated correctly
		assertTrue(ran.compareTo(z) == 0);
		assertTrue(dom.compareTo(cn) == 0);
	}
	
	@Test
	public void divideComplexNumber() {
		
		MyDouble a = new MyDouble(2), b = new MyDouble(12);
		MyDouble c = new MyDouble(2), d = new MyDouble(-6);
		MyDouble e = new MyDouble(-1.7), f = new MyDouble(0.9);
		MyDouble g = new MyDouble(6), h = new MyDouble(12);
		MyDouble i = new MyDouble(3), j = new MyDouble(-6);
		MyDouble k = new MyDouble(-1.2), l = new MyDouble(1.6);
		
		ComplexNumber x = new ComplexNumber(a, b); // creates a complex number
		ComplexNumber y = new ComplexNumber(c, d); // creates a complex number
		ComplexNumber z = new ComplexNumber(e, f); // creates a complex number
		ComplexNumber an = new ComplexNumber(g, h); // creates a complex number
		ComplexNumber bn = new ComplexNumber(i, j); // creates a complex number
		ComplexNumber cn = new ComplexNumber(k, l); // creates a complex number
		
		ComplexNumber ran = x.divide(y);
		ComplexNumber dom = an.divide(bn);
		
		// checks if the division is calculated correctly
		assertTrue(ran.compareTo(z) == 0);
		assertTrue(dom.compareTo(cn) == 0);
	}
	
	@Test
	public void equalComplexNumber() {
		
		MyDouble a = new MyDouble(2), b = new MyDouble(12);
		MyDouble c = new MyDouble(2), d = new MyDouble(-6);
		MyDouble e = new MyDouble(5), f = new MyDouble(12);
		MyDouble g = new MyDouble(2), h = new MyDouble(12);
		
		ComplexNumber r = new ComplexNumber(a, b); // creates a complex number
		ComplexNumber x = new ComplexNumber(c, d); // creates a complex number
		ComplexNumber y = new ComplexNumber(e, f); // creates a complex number
		ComplexNumber z = new ComplexNumber(g, h); // creates a complex number
		
		// checks if the two complex numbers are equal or not
		assertTrue(r.equals(x) == false);
		assertTrue(z.equals(y) == false);
		assertTrue(r.equals(z) == true);
		
	}
	
	@Test
	public void compareToComplexNumber() {
		
		MyDouble a = new MyDouble(2), b = new MyDouble(12);
		MyDouble c = new MyDouble(2), d = new MyDouble(-6);
		MyDouble e = new MyDouble(5), f = new MyDouble(12);
		MyDouble g = new MyDouble(2), h = new MyDouble(12);
		
		ComplexNumber r = new ComplexNumber(a, b); // creates a complex number
		ComplexNumber x = new ComplexNumber(c, d); // creates a complex number
		ComplexNumber y = new ComplexNumber(e, f); // creates a complex number
		ComplexNumber z = new ComplexNumber(g, h); // creates a complex number
		
		// checks if the comparison is done correctly
		assertTrue(r.compareTo(x) > 0);
		assertTrue(z.compareTo(y) < 0);
		assertTrue(r.compareTo(z) == 0);
		
	}
	
	@Test
	public void stringComplexNumber() {
		
		MyDouble a = new MyDouble(1.2), b = new MyDouble(1.2);
		MyDouble c = new MyDouble(-1.2), d = new MyDouble(1.2);
		MyDouble e = new MyDouble(1.2), f = new MyDouble(-1.2);
		MyDouble g = new MyDouble(-1.2), h = new MyDouble(-1.2);
		
		ComplexNumber r = new ComplexNumber(a, b); // creates a complex number
		ComplexNumber x = new ComplexNumber(c, d); // creates a complex number
		ComplexNumber y = new ComplexNumber(e, f); // creates a complex number
		ComplexNumber z = new ComplexNumber(g, h); // creates a complex number
		
		/* checks if the conversation form complex number to string is 
		done correctly */
		assertTrue(r.toString().equals("1.2+1.2i"));
		assertTrue(x.toString().equals("-1.2+1.2i"));
		assertTrue(y.toString().equals("1.2-1.2i"));
		assertTrue(z.toString().equals("-1.2-1.2i"));

		
	}
	
	@Test
	public void normComplexNumber() {
		
		MyDouble a = new MyDouble(2.0), b = new MyDouble(6.0);
		MyDouble c = new MyDouble(40);
		MyDouble d = new MyDouble(3.0), e = new MyDouble(4.0);
		MyDouble f = new MyDouble(25);
		
		ComplexNumber x = new ComplexNumber(a, b); // creates a complex number 
		ComplexNumber y = new ComplexNumber(d, e); // creates a complex number
		
		// checks if the norm is calculated correctly
		assertTrue(ComplexNumber.norm(x).compareTo(c.sqrt()) == 0);
		assertTrue(ComplexNumber.norm(y).compareTo(f.sqrt()) == 0);
		
	}
	
	@Test
	public void parseComplexNumber() {
		
		String r = "         1.2+1.2i"; // creates a complex number string
		String x = " -1.2 + 1.2 i  "; // creates a complex number string
		String y = " 1 . 2 - 1 . 2 i "; // creates a complex number string
		String z = "-1.2-1.2i"; // creates a complex number string
		
		MyDouble a = new MyDouble(1.2), b = new MyDouble(1.2);
		MyDouble c = new MyDouble(-1.2), d = new MyDouble(1.2);
		MyDouble e = new MyDouble(1.2), f = new MyDouble(-1.2);
		MyDouble g = new MyDouble(-1.2), h = new MyDouble(-1.2);
		
		ComplexNumber r1 = new ComplexNumber(a, b); // creates a complex number
		ComplexNumber x1 = new ComplexNumber(c, d); // creates a complex number
		ComplexNumber y1 = new ComplexNumber(e, f); // creates a complex number
		ComplexNumber z1 = new ComplexNumber(g, h);	// creates a complex number

		// Tests all cases of +/- numbers and if they parse properly
		assertTrue(ComplexNumber.parseComplexNumber(r).equals(r1));
		assertTrue(ComplexNumber.parseComplexNumber(x).equals(x1));
		assertTrue(ComplexNumber.parseComplexNumber(y).equals(y1));
		assertTrue(ComplexNumber.parseComplexNumber(z).equals(z1));
				
	}
	
}
