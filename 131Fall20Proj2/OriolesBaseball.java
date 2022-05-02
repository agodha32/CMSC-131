import java.util.Scanner;

public class OriolesBaseball {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Type 1 to enter a number or 2 to enter a name: ");
		int choiceOne = input.nextInt();
		input.nextLine();

		if (choiceOne == 1) {

			System.out.print("Enter player number: ");
			int jerseyNumber = input.nextInt();
			input.nextLine();

			if (jerseyNumber == 19) {

				System.out.print("Which player wears number " + jerseyNumber 
						+ " on his jersey? ");
				String davis = input.nextLine();

				if (davis.equals("Davis")) {

					System.out.println("Correct!");

				} else {

					System.out.println("Incorrect!");

				}

			} else if (jerseyNumber == 17) {

				System.out.print("Which player wears number " + jerseyNumber 
						+ " on his jersey? ");
				String cobb = input.nextLine();
				if (cobb.equals("Cobb")) {

					System.out.println("Correct!");

				} else {

					System.out.println("Incorrect!");

				}

			} else if (jerseyNumber == 11) {

				System.out.print("Which player wears number " + jerseyNumber 
						+ " on his jersey? ");
				String iglesias = input.nextLine();
				if (iglesias.equals("Iglesias")) {

					System.out.println("Correct!");

				} else {

					System.out.println("Incorrect!");

				}

			} else if (jerseyNumber == 16) {

				System.out.print("Which player wears number " + jerseyNumber 
						+ " on his jersey? ");
				String mancini = input.nextLine();
				if (mancini.equals("Mancini")) {

					System.out.println("Correct!");

				} else {

					System.out.println("Incorrect!");

				}

			} else {

				System.out.println("Invalid Choice.");

			}

		} else if (choiceOne == 2) {

			System.out.print("Choose a name: ");
			String name = input.nextLine();

			if (name.equals("Davis")) {

				System.out.print("What number does " + name + " wear? ");
				int davisNum = input.nextInt();
				if (davisNum == 19) {

					System.out.println("Correct!");

				} else {

					System.out.println("Incorrect!");

				}

			} else if (name.equals("Cobb")) {

				System.out.print("What number does " + name + " wear? ");
				int cobbNum = input.nextInt();
				if (cobbNum == 17) {

					System.out.println("Correct!");

				} else {

					System.out.println("Incorrect!");

				}

			} else if (name.equals("Iglesias")) {

				System.out.print("What number does " + name + " wear? ");
				int iglesiasNum = input.nextInt();
				if (iglesiasNum == 11) {

					System.out.println("Correct!");

				} else {

					System.out.println("Incorrect!");

				}

			} else if (name.equals("Mancini")) {

				System.out.print("What number does " + name + " wear? ");
				int manciniNum = input.nextInt();
				if (manciniNum == 16) {

					System.out.println("Correct!");

				} else {

					System.out.println("Incorrect!");

				}

			} else {

				System.out.println("Invalid Choice.");

			}

		}

		input.close();

	}
}
