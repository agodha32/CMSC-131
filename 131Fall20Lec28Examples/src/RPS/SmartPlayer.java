package RPS;

import java.util.Random;

public class SmartPlayer implements Player {

	private int opponentR = 0, opponentP = 0, opponentS = 0;
	
	@Override
	public String getName() {
		return "SmartPlayer";
	}

	@Override
	public String getSubsequentMove(String lastOpponentMove) {
		if (lastOpponentMove.equals("R")) {
			opponentR++;
		} else if (lastOpponentMove.equals("P")) {
			opponentP++;
		} else {
			opponentS++;
		}
		if (opponentR > opponentP && opponentR > opponentS) {
			return "P";
		} else if (opponentP > opponentS) {
			return "S";
		} else {
			return "R";
		}
	}

}
