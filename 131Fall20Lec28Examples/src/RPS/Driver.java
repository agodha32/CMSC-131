package RPS;

public class Driver {

	public static void main(String[] args) {
		Player p1 = new HumanPlayer();
		Player p2 = new SmartPlayer();
		Game.playRPS(p1, p2, 10);
	}

}
