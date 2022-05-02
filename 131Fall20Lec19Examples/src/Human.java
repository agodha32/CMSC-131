

public class Human {

	public String name;

	public Human(String nameIn) {
		name = nameIn;
	}
	 
	public void walk(Dog canine) {
		System.out.println(name + " is walking " + canine.getName());
		canine.setWeight(canine.getWeight() - 2.0);
	}
}
