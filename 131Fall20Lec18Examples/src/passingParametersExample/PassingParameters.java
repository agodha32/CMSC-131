package passingParametersExample;

public class PassingParameters {
	
	public static void main(String[] args) {
		int value = 0;
		Dog canine = new Dog("Fido", 27.4);
		
		foo(value, canine);
		
		System.out.println(value);
		System.out.println(canine);
	}
	
	public static void foo(int value, Dog canine) {
		canine.name += ", the Amazing Car Chaser";
		canine.numCarsChased += 1000000;
		value = 42;
	}
	
}
