
public class Driver {

	public static void main(String[] args) {
		Dog a, b, c;
		a = new Dog();
		b = new Dog();
		c = new Dog();
		
		a.name = "Fido";
		b.name = "Spot";
		c.name = "Steve";
		
		a.weight = 27.5;
		b.weight = 123.77;
		c.weight = 40.2;
		
		a.numCarsChased = 0;
		b.numCarsChased = 1000;
		c.numCarsChased = 12;
		
		a.bark();
		b.chaseCar();

	}

}
