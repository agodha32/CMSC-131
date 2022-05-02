
public class StrangeCalculation {

	public static void main(String[] args) {
		double x = 3.9;
		double y = 3.8; 
		double difference = x - y;
		System.out.println("difference: " + difference);
		if (difference == 0.1) {
			System.out.println("Looks good!");
		} else {
			System.out.println("Something is wrong.");
		}
	}
}
