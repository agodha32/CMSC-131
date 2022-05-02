
public class HanoiSolver {

	private static int counter = 1;
	
	public static void solve(int numDisks, int source, int dest) {
		if (numDisks == 0) {
			return;
		}
		int otherIndex = 6 - (source + dest);
		solve(numDisks - 1, source, otherIndex);
		System.out.println(counter++ + "  Moving disk from " + source + " to " + dest);
		solve(numDisks - 1, otherIndex, dest);
	}
	
	public static void main(String[] args) {
		solve(16, 1, 3);
	}

}
