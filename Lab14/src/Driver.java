public class Driver {

	public static void main(String[] args) {

		Rational a = new Rational(15,5);
		Rational b = new Rational(5,7);
		Rational c = new Rational(2,3);
		
		System.out.println(a);
		System.out.println("Reciprocal of " + b + " is " + b.reciprocal());
		System.out.println(Rational.multiply(a,b));
		System.out.println(c.devide(b));
		System.out.println(c.add(b));
 
		
		
	}

}
