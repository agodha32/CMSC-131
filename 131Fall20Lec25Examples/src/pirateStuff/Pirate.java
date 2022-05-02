package pirateStuff;

public class Pirate {
	private int age;
	private double weight;
	private EyePatch patch;
	private Parrot bird;
	
	/* This constructor makes a deep copy of the pirate */
	public Pirate(Pirate other) {
		age = other.age;
		weight = other.weight;
		patch = new EyePatch(other.patch);   
		bird = new Parrot(other.bird);
	}
	
	/* Make a copy of the Parrot if it is mutable */
	public Parrot getBird() {
		return new Parrot(bird);
	}	
	
	/* No need to make a copy of the Eyepatch if it is immutable */
	public EyePatch getPatch() {
		return patch;
	}
	
	// imagine lots more stuff...
	
}
