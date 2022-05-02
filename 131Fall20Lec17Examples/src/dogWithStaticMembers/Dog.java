package dogWithStaticMembers;

public class Dog {
	
	public final static int MAX_DOG_WEIGHT = 200;
	public static int numDogsConstructed = 0;
	
	/* instance variables for the state */
	public String name;
	public double weight;
	public int numCarsChased;
	
	/* Constructors */
	public Dog(String nameIn, double weightIn, int carsIn) {
		name = nameIn;
		weight = weightIn;
		if (weight > MAX_DOG_WEIGHT) {
			weight = MAX_DOG_WEIGHT;
		}
		numCarsChased = carsIn;
		numDogsConstructed++;
	}
	
	
	/* instance methods for behaviors */
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
		return name.equals(other.name) && weight == other.weight && 
				numCarsChased == other.numCarsChased;
	}
	
	public String toString() {
		return name + ", weight: " + weight + ", cars chased: " + numCarsChased;
	}
	
	public static int secondsToConsumeFood(int amount) {
		return 5 * amount;
	}

}
