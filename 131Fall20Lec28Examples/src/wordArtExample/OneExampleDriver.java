package wordArtExample;
import java.io.FileNotFoundException;


public class OneExampleDriver {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		WordArt.doWordArt(new WordStreamFromFile("FiftyStates.txt"), 500);
	}

}
