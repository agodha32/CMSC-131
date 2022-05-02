package flyingThings;

public class ComplexDriver {

	public static void main(String[] args) {
		FlyingThing[] things = new FlyingThing[3];
		things[0] = new Bird();
		things[1] = new Airplane();
		things[2] = new UFO();
		for (int i = 0; i < things.length; i++) {
			Flight.doFlight(things[i]);
		}
	}

}
