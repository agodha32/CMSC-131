import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	private static Scanner scanner = new Scanner(System.in);
	private static BetterNumberList list = new BetterNumberList(5);

	public static void main(String[] args) {
		doOutput();
		while(true) {
			System.out.print("Enter 1 to insert, 2 to remove, 3 to sort: ");
			int choice = scanner.nextInt();
			if (choice == 1) {
				System.out.print("   Element to insert? ");
				int element = scanner.nextInt();
				boolean badInput;
				do {
					System.out.print("   Position? " );
					int position = scanner.nextInt();
					badInput = false;
					try {
						list.insert(element, position);
					} catch(IllegalArgumentException e) {
						System.out.println("   " + position + " is not a legal index");
						badInput = true;
					}
				} while(badInput);
			} else if (choice == 2) {
				System.out.print("   Element to remove? ");
				int element = scanner.nextInt();
				list.removeAll(element);
			} else if (choice == 3) {
				list.mySort();
			}
			doOutput();
		}
	}

	private static void doOutput() {
		int[] values = list.getList();
		System.out.println("List is:  " + Arrays.toString(values));
	}

}
