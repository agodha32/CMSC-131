public class Alien implements Comparable<Alien> {

	private int numHeads;
	private String name;
	
	public Alien(int n, String name) {
		this.numHeads = n;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumHeads() {
		return numHeads;
	}
	
	public static String reverseString(String s) {

		String reverse = "";
		
		for(int x = 0; x < s.length(); x++) {
			
			char temp = s.charAt(s.length() - x - 1);
			reverse = reverse + temp;
			
		}
		
		return reverse;
	
	}
	
	public int compareTo(Alien other) {
		
		String x = reverseString(this.name);
		String y = reverseString(other.name);

		
		return x.compareTo(y);
		
	}
	
	public String toString() {
		return name + ":" + numHeads;
	}

}
