package flyingThings;

public class Flight {

	public static void doFlight(FlyingThing flyer) {
		System.out.println("Prepare for flight...");
		flyer.takeOff();
		System.out.println("Cruising now...");
		flyer.fly();
		System.out.println("Prepare to land...");
		flyer.land();
		System.out.println("Flight over.");
	}
}
