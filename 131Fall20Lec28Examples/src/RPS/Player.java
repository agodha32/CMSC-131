package RPS;

import java.util.Random;

public interface Player {
	
	public String getName();
	
	public default String getInitialMove() {
		Random random = new Random();
		int choice = random.nextInt(3);
		if (choice == 0) {
			return "R";
		} else if (choice == 1) {
			return "P";
		} else {
			return "S";
		}
	}
		
	public String getSubsequentMove(String lastOpponentMove);
	
	public static String winLossOrDraw(String myMove, String opponentMove) {
		if (myMove.equals(opponentMove)) {
			return "DRAW";
		}
		if (myMove.equals("R") && opponentMove.equals("S") ||
			myMove.equals("S") && opponentMove.equals("P") ||
			myMove.equals("P") && opponentMove.equals("R")) {
			return "WIN";
		}
		return "LOSS";
	}
}
