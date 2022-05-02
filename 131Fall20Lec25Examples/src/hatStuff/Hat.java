package hatStuff;

public class Hat {
	private int size;
	
	public Hat(int size) {
		this.size = size;
	}
	
	public Hat(Hat other) {
		this.size = other.size;
	}
}
