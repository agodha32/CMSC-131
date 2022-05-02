package words;

import java.util.Random;

public class Word {

	private char[] letters;
	
	public Word() {
		Random r = new Random();
		int length = r.nextInt(6) + 3;
		letters = new char[length];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = (char)(r.nextInt(26) + 'A');
		}
	}
	
	public String toString() {
		return new String(letters);
	}
}
