package question2;
import java.util.ArrayList;

public class WordSet {

	/* DO NOT MODIFY THIS VARIABLE DECLARATION (LEAVE IT PUBLIC.) */
	public ArrayList<String> words;
	
	/* DO NOT MODIFY THIS CONSTRUCTOR */
	public WordSet() {
		words = new ArrayList<>();
	}
	
	/* Write your implementations below this point */
	public WordSet(WordSet other) {
		
		this.words = new ArrayList<String> ();
		
		for(String x: other.words) {
			
			this.words.add(new String(x));
			
		}
		
	}
	
	public boolean equals(Object x) {
		
		if(!(x instanceof WordSet)) {
			
			return false;
		
		}
		
		WordSet alias = (WordSet) x;	
		int z = 0;
		
		for(String y : alias.words) {
			
			if(this.words.contains(y)) {
				
				z++;
				
			}
			
		}
		
	
	return z == this.words.size();
	
	}
}
