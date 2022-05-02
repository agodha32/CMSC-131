package words;
import java.util.Random;

public class Paragraph {

	private Sentence[] sentences;
	
	public Paragraph() {
		Random r = new Random();
		int length = r.nextInt(6) + 2;
		sentences = new Sentence[length];
		for (int i = 0; i < length; i++) {
			sentences[i] = new Sentence();
		}
	}
	
	public String toString() {
		String answer = sentences[0].toString();
		for (int i = 1; i < sentences.length; i++) {
			answer += " " + sentences[i];
		}
		answer += "\n\n";
		return answer;
	}
}
