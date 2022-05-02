package RPS;

public class Game {

	private static int wins = 0, losses = 0, draws = 0;

	public static void playRPS(Player player1, Player player2, int numGames) {

		String p1Move = player1.getInitialMove();  // "R", "P", or "S"
		String p2Move = player2.getInitialMove();

		while (true) {
			String resultForP1 = Player.winLossOrDraw(p1Move, p2Move);  // "WIN", "LOSS", "DRAW"
			doOutput(player1, player2, p1Move, p2Move, resultForP1);
			if (--numGames == 0) {
				break;
			}
			String p1NextMove = player1.getSubsequentMove(p2Move);
			String p2NextMove = player2.getSubsequentMove(p1Move);
			p1Move = p1NextMove;
			p2Move = p2NextMove;
		}
		printTotals(player1);
	}

	private static void doOutput(Player p1, Player p2, String p1Move, String p2Move, String result) {
		System.out.println(p1.getName() + ": " + p1Move + "   " + 
				p2.getName() + ": " + p2Move + "     " + 
				result + " for " + p1.getName());
		System.out.println();
		if (result.equals("WIN")) {
			wins++;
		} else if (result.equals("LOSS")) {
			losses++;
		} else {
			draws++;
		}
	}
	
	private static void printTotals(Player p1) {
		System.out.println("Totals for " + p1.getName());
		System.out.println("Wins: " + wins + "  Losses: " + losses + "  Draws: " + draws);
	}

}
