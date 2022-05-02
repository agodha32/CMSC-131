
public class Rational {
	
	int num, den;
	
	public Rational(int numIn, int denIn) {
		
		num = numIn;
		den = denIn;
		
	}
	
	public String toString() {
		
		return (num + "/" + den);
		
	}
	
	public String reciprocal() {
		
		return (den + "/" + num);
		
	}
	
	public static String multiply(Rational a, Rational b) {
		
		int newNum = a.num * b.num;
		int newDen = a.den * b.den;
		
		Rational c = new Rational(newNum, newDen);
		
		return c.toString();
		
	}
	
	public String devide(Rational a) {
		
		int newNum = num * a.den;
		int newDen = den * a.num;
		
		Rational d = new Rational(newNum, newDen);
		
		return d.toString();
		
	}

	public String add(Rational a) {
		
		int newNum = (num * a.den) + (a.num * den);
		int newDen = den * a.den; 
		
		Rational e = new Rational(newNum, newDen);
		
		return e.toString();
		
	}
	
}
