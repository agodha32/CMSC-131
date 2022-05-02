package question3;
import java.util.ArrayList;

import question2.WordSet;

public class WordSetUnion {
	
	public static WordSet union(ArrayList<WordSet> a) {
		
		WordSet x = new WordSet();
		
		for(WordSet y: a) {
			
			int count = 0;
			
			if(count == 0) {
				
				for(String z: y.words) {
					
					x.words.add(z);
					
				}
				
				count++;
				
			} else {
				
				for(String z: y.words) {
					
					if(x.words.contains(z)) {
						
						
					} else {
						
						x.words.add(z);
						
					}
					
					count++;
					
				}
				
			}
			
		}
		
		return x;	
	
	}

}
