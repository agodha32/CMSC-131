package hatStuff;

public class AdjustableHatOwner {

	private int hatSize;
	private AdjustableHat myHat;
	
	public AdjustableHatOwner (int hatSize) {
		this.hatSize = hatSize;
		myHat = new AdjustableHat(hatSize);
	}
	
	public AdjustableHat getHatOne() {
		return myHat;
	}
	
	public AdjustableHat getHatTwo() {
		return new AdjustableHat(myHat);
	}
}
