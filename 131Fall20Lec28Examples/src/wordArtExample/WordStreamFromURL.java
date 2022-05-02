package wordArtExample;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class WordStreamFromURL implements WordStream {

	private Scanner scanner;
	
	public WordStreamFromURL(String urlString) throws IOException {
		URL url = new URL(urlString);
		URLConnection connection = url.openConnection();
		InputStream inputStream = connection.getInputStream();
		scanner = new Scanner(inputStream);
	}
	
	public String getWord() {
		return scanner.next();
	}
	
	public boolean hasAnotherWord() {
		return scanner.hasNext();
	}
	
}
