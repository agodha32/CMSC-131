package dogWithStaticMembers;

public class Driver {

	public static void main(String[] args) {
		Dog a = new Dog("Fido", 27.5, 0);
		Dog b = new Dog("Spot", 123.77, 1000);
		Dog c = new Dog("Steve", 140.2, 12);
		
		System.out.println("max is " + Dog.MAX_DOG_WEIGHT);
		System.out.println("Dogs constructed: " + Dog.numDogsConstructed);
		System.out.println("Seconds for 5 pounds of food: " + Dog.secondsToConsumeFood(5));
	}

}
