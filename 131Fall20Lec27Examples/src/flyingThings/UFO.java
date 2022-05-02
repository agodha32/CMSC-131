package flyingThings;

public class UFO implements FlyingThing {

	@Override
	public void takeOff() {
		System.out.println("Whirring noises... lifts straight up into space...");
	}

	@Override
	public void fly() {
		System.out.println("Weird lights flashing... space warp...");
	}

	@Override
	public void land() {
		System.out.println("Scary noises... exit ramp lowers... aliens come out.");
	}
	
	public void destroyPlanet() {
		System.out.println("Lasers fired at planet... planet explodes.");
	}

}
