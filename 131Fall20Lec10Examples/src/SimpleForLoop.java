
public class SimpleForLoop {

	public static void main(String[] args) {
		
		for (int counter = 1; counter < 1000000; counter = counter * 2) {
			System.out.println(counter);
		}
		System.out.println("DONE");
	}
}
