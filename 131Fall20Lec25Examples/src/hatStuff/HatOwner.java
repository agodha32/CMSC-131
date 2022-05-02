package hatStuff;

public class HatOwner {

	private int hatSize;
	private Hat myHat;
	
	public HatOwner (int hatSize) {
		this.hatSize = hatSize;
		myHat = new Hat(hatSize);
	}
	
	public Hat getHatOne() {
		return myHat;
	}
	
	public Hat getHatTwo() {
		return new Hat(myHat);
	}
}
