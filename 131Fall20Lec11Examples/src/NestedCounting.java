
public class NestedCounting {

	public static void main(String[] args) {
		for (int outer = 1; outer <= 5; outer = outer + 1) {
			System.out.println("Outer count is now " + outer);
			for (int inner = 1; inner <= 5; inner = inner + 1) {
				System.out.println("\t" + inner);
			}
			System.out.println("That was exhausting!\n");
		}
	}

}
