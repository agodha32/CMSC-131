package hatStuff;

public class HatCollectionOwner {

	private Hat[] myHats;
	private int hatSize;
	
	public HatCollectionOwner(int hatSize, int numHats) {
		this.hatSize = hatSize;
		myHats = new Hat[numHats];
		for (int i = 0; i < myHats.length; i++) {
			myHats[i] = new Hat(hatSize);
		}
	}
	
	public Hat[] getHatsOne() {
		return myHats;
	}
	
	public Hat[] getHatsTwo() {
		Hat[] copy = new Hat[myHats.length];
		for (int i = 0; i < myHats.length; i++) {
			copy[i] = myHats[i];
		}
		return copy;
	}
	
	public Hat[] getHatsThree() {
		Hat[] copy = new Hat[myHats.length];
		for (int i = 0; i < myHats.length; i++) {
			copy[i] = new Hat(myHats[i]) ;
		}
		return copy;
	}
}
