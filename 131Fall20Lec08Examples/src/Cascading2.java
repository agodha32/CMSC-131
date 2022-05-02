import java.util.Scanner;

public class Cascading2 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How many credits do you have? ");
		int credits = userInput.nextInt();
		
		if (credits < 30) {
			System.out.println("Your class standing is Freshman");
		} else if (credits < 60) {
			System.out.println("Your class standing is Sophomore");
		} else if (credits < 90) {
			System.out.println("Your class standing is Junior");
		} else if (credits < 120) {
			System.out.println("Your class standing is Senior");
		} else {
			System.out.println("Your class standing is Super Senior");
		}
		userInput.close();
	}

}
