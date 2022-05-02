package RPS;
import java.util.Scanner;

public class HumanPlayer implements Player {

	private String name;
	private Scanner scanner = new Scanner(System.in);
	
	public HumanPlayer() {
		System.out.print("What is your name? ");
		name = scanner.nextLine();
		System.out.println();
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getInitialMove() {
		System.out.print(name + ", enter move (R/P/S): ");
		return scanner.nextLine();
	}

	@Override
	public String getSubsequentMove(String lastOpponentMove) {
		System.out.print(name + ", enter next move (R/P/S): ");
		return scanner.nextLine();
	}
}
