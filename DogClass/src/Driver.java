
public class Driver {

	public static void main(String[] args) {
		
		Dog a, b, c;
		
		a = new Dog("Fido", 27.5, 0);
		b = new Dog("Spot", 123.77, 1000);
		c = new Dog("Steve", 140.2, 12);
		
		a.sayHello();
		a.chaseCar(2.7);
		
		boolean result = a.eatFood("pizza", 2.2);
		
		double foodNeeded = a.calculateDailyFoodRequirement();
		
		Dog d = new Dog("Susan", 12.0);
		Dog e = new Dog();
		Dog f = new Dog(a);   // invoking copy constructor
	
	}

}
