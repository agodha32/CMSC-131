package wordArtExample;
import java.util.Scanner;

public class WordStreamFromKeyboard implements WordStream {

	private Scanner scanner = new Scanner(System.in);
	private boolean keepGoing = true;
	
	public String getWord() {
		String word = scanner.next();
		if (word.equals("stop")) {
			keepGoing = false;
			return "";
		}
		return word;
	}
	
	public boolean hasAnotherWord() {
		return keepGoing;
	}

}
