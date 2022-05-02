package flyingThings;

public class Bird implements FlyingThing {

	@Override
	public void takeOff() {
		System.out.println("Flapping wings like crazy...");
	}

	@Override
	public void fly() {
		System.out.println("Slowly flapping wings...");
	}

	@Override
	public void land() {
		System.out.println("Glide gently downward... extend feet...");
	}

}
