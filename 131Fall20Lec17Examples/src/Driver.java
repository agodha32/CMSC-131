
public class Driver {

	public static void main(String[] args) {
		Dog a, b, c;
		a = new Dog("Fido", 27.5, 0);
		b = new Dog("Spot", 123.77, 1000);
		c = new Dog("Steve", 140.2, 12);
		
		Dog copy = new Dog(c);   // copy constructor call
		
		if (copy.equals(c)) {
			System.out.println("SAME");
		} else {
			System.out.println("DIFFERENT");
		}
		
		System.out.println(a);
	}

}
