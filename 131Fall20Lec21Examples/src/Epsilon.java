
public class Epsilon {

	public static void main(String[] args) {
		double EPSILON = 0.00000000001;
		double x = 3.9;
		double y = 3.8;
		double difference = x - y;
		if (Math.abs(difference - 0.1) < EPSILON) {
			System.out.println("Looks good!");
		} else {
			System.out.println("Something is wrong.");
		}
	}

}
