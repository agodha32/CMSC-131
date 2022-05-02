package autoBoxingAndUnboxing;

public class IntegerExample {

	public static void main(String[] args) {
		Integer a, b, x;
		
		a = new Integer(5);
		a = Integer.valueOf(5);
		b = 6;                      // auto-boxing
		
		int y = a.intValue();
		int z = a;                  // auto-unboxing
		
		x = Integer.valueOf(a.intValue() + b.intValue());
		x = a + b;               // both auto-boxing and auto-unboxing
		
		if (a.compareTo(b) < 0) {
			System.out.println("a is smaller");
		}
		if (a < b) {                // auto-unboxing
			System.out.println("a is smaller");
		}
		
	}

}
