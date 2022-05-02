package hatStuff;

public class AdjustableHat {

	private int size;
	
	public AdjustableHat(int size) {
		this.size = size;
	}
	
	public AdjustableHat(AdjustableHat other) {
		this.size = other.size;
	}
	
	public void changeSize(int newSize) {
		size = newSize;
	}
}
