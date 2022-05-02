package words;
import java.util.Random;

public class Sentence {

	private Word[] words;
	
	public Sentence() {
		Random r = new Random();
		int length = r.nextInt(12) + 3;
		words = new Word[length];
		for (int i = 0; i < length; i++) {
			words[i] = new Word();
		}
	}
	
	public String toString() {
		String answer = words[0].toString();
		for (int i = 1; i < words.length; i++) {
			answer += " " + words[i];
		}
		answer += ".";
		return answer;
	}
}
