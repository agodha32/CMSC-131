package RPS;

public class RandomPlayer implements Player {
	
	@Override
	public String getName() {
		return "RandomPlayer";
	}	

	@Override
	public String getSubsequentMove(String lastOpponentMove) {
		return getInitialMove();
	}
	
}
