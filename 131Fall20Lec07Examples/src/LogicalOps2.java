import java.util.Scanner;

public class LogicalOps2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your favorite animal to own as a pet? ");
		String animal = sc.next();
		System.out.print("How many " + animal + "s do you own? ");
		int numberOwned = sc.nextInt();
		System.out.println();
		if (animal.equals("dog") || 
			animal.equals("cat") ||
			animal.equals("horse")) {
			System.out.println("Owning " + animal + "s is not unusual.");
		} else {
			System.out.println("Owning " + animal + "s is a bit odd.");
		}
		if (numberOwned == 0) {
			System.out.println("You should get a " + animal + "!");
		}
		if (numberOwned > 0 && numberOwned < 10 && !animal.equals("dragon")) {
			System.out.println("You should get another " + animal + ".");
		    System.out.println("It would be better to have " + (numberOwned + 1));
			System.out.println("in case a dragon attacks.");
		}
		
		sc.close();
	}
}
