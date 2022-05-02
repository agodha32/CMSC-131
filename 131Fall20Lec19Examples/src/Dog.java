


public class Dog {
	
	public final static int MAX_DOG_WEIGHT = 200;
	public static int numDogsConstructed = 0;
	
	/* instance variables for the state */
	private String name;
	private String weight;
	private int numCarsChased;
	
	/* Constructors */
	public Dog(String name, double weight, int numCarsChased) {
		this.name = name;
		
		this.weight = String.valueOf(weight);
		this.numCarsChased = numCarsChased;
		if (this.numCarsChased < 0) {
			this.numCarsChased = 0;
		}
		numDogsConstructed++;
	}
	
	public Dog(String nameIn, double weightIn) {
		this(nameIn, weightIn, 0);
	}
	
	public Dog() {
		this("Unknown", 10.0, 0);
	}
	
	public Dog(Dog other) {   /// COPY CONSTRUCTOR!!!
		this(other.name, Double.valueOf(other.weight), other.numCarsChased);
	}
	
	/* instance methods for behaviors */
	
	/* getters */
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return Double.valueOf(weight);
	}
	
	public int getNumCars() {
		return numCarsChased;
	}
	
	/* setters */
	public void setName(String nameIn) {
		name = nameIn;
	}
	
	public void setWeight(double weightIn) {
		weight = String.valueOf(weightIn);
	}
	
	public void setNCC(int n) {
		if (n < 0) {
			n = 0;
		}
		this.numCarsChased = n;
	}

	
	public void sayHello() {
		System.out.println("Woof! My name is " + name + ". I weight " + weight +
				           ", and I have chased " + numCarsChased + " cars.");
	}
	
	public void chaseCar(double numMiles) {
		System.out.println(name + " is chasing a car for " + numMiles + " miles." );
		numCarsChased++;
		weight = String.valueOf(Double.valueOf(weight) + 2.0 * numMiles);
	}
	
	public boolean equals(Dog other) {
		return this.name.equals(other.name) && weight.equals(other.weight) && 
				this.numCarsChased == other.numCarsChased;
	}
	
	public String toString() {
		return name + ", weight: " + this.weight + ", cars chased: " + this.numCarsChased;
	}
	
	public static int secondsToConsumeFood(int amount) {
		return 5 * amount;
	}

}
