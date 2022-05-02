package hatStuff;

public class AdjustableHatCollectionOwner {

	private AdjustableHat[] myHats;
	private int hatSize;
	
	public AdjustableHatCollectionOwner(int hatSize, int numHats) {
		this.hatSize = hatSize;
		myHats = new AdjustableHat[numHats];
		for (int i = 0; i < myHats.length; i++) {
			myHats[i] = new AdjustableHat(hatSize);
		}
	}
	
	public AdjustableHat[] getHatsOne() {
		return myHats;
	}
	
	public AdjustableHat[] getHatsTwo() {
		AdjustableHat[] copy = new AdjustableHat[myHats.length];
		for (int i = 0; i < myHats.length; i++) {
			copy [i] = myHats[i];
		}
		return copy;
	}
	
	public AdjustableHat[] getHatsThree() {
		AdjustableHat[] copy = new AdjustableHat[myHats.length];
		for (int i = 0; i < myHats.length; i++) {
			copy [i] = new AdjustableHat(myHats[i]) ;
		}
		return copy;
	}
}
