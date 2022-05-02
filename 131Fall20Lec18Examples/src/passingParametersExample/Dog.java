package passingParametersExample;


public class Dog {
	
	public final static int MAX_DOG_WEIGHT = 200;
	public static int numDogsConstructed = 0;
	
	/* instance variables for the state */
	public String name;
	public double weight;
	public int numCarsChased;
	
	/* Constructors */
	public Dog(String name, double weight, int numCarsChased) {
		this.name = name;
		if (weight > MAX_DOG_WEIGHT) {
			weight = MAX_DOG_WEIGHT;
		}
		this.weight = weight;
		this.numCarsChased = numCarsChased;
		numDogsConstructed++;
	}
	
	public Dog(String nameIn, double weightIn) {
		this(nameIn, weightIn, 0);
	}
	
	public Dog() {
		this("Unknown", 10.0, 0);
	}
	
	public Dog(Dog other) {   /// COPY CONSTRUCTOR!!!
		this(other.name, other.weight, other.numCarsChased);
	}
	
	/* instance methods for behaviors */
	
	/* getters */
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getNumCars() {
		return numCarsChased;
	}
	
	/* setters */
	public void setName(String nameIn) {
		name = nameIn;
	}
	
	public void setWeight(double weightIn) {
		weight = weightIn;
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
		weight -= 2.0 * numMiles;
	}
	
	public double calculateDailyFoodRequirement() {
		return weight * 0.10;
	}
	
	public boolean eatFood(String type, double amount) {
		System.out.println(name + " is eating " + amount + " pounds of " + type);
		weight += amount;
		double foodNeeded = calculateDailyFoodRequirement();
		return amount >= foodNeeded;
	}
	
	public boolean equals(Dog other) {
		return this.name.equals(other.name) && this.weight == other.weight && 
				this.numCarsChased == other.numCarsChased;
	}
	
	public String toString() {
		return name + ", weight: " + this.weight + ", cars chased: " + this.numCarsChased;
	}
	
	public static int secondsToConsumeFood(int amount) {
		return 5 * amount;
	}

}
