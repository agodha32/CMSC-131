package wordArtExample;
import java.io.IOException;


public class FourExampleDriver {
	
	public static void main(String[] args) throws IOException, InterruptedException {

		WordArt.doWordArt(new WordStreamFromKeyboard(), 1500);
		WordArt.doWordArt(new WordStreamFromFile("FiftyStates.txt"), 400);
		WordArt.doWordArt(new WordStreamFromURL("http://www.cs.umd.edu/~fpe"), 250);
		WordArt.doWordArt(new WordStreamRandomlyGenerated(), 100);

	}
}
