package flyingThings;

public class Airplane implements FlyingThing {

	@Override
	public void takeOff() {
		System.out.println("Engines roar... nose lifts... ");
	}

	@Override
	public void fly() {
		System.out.println("Engines humming... level flight...");
	}

	@Override
	public void land() {
		System.out.println("Landing gear down.... brake to a stop...");
	}

}
