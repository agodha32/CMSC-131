package wordArtExample;
import java.util.Random;

public class WordStreamRandomlyGenerated implements WordStream {

	public String getWord() {
		Random random = new Random();
		int length = random.nextInt(10) + 3; 
		String word = "";
		for (int i = 0; i < length; i++) {
			word += (char)(random.nextInt(26) + 'A');
		}
		return word;
	}
	
	public boolean hasAnotherWord() {
		return true;
	}

}
