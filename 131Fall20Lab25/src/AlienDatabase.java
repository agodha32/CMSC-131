import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AlienDatabase {
	
	static ArrayList<ArrayList<Alien>> data;
	
	public AlienDatabase() {
		
		data = new ArrayList<ArrayList<Alien>>();
		
		for(int i = 0; i < 10; i++) {
			
			data.add(new ArrayList<>());
			
		}
		
	}
	
	public void addAlien(Alien a) {
		
		data.get(a.getNumHeads()-1).add(a);
		
		Collections.sort(data.get(a.getNumHeads()-1));
		
	}
	
	public void displayDatabase() {
		for (int row = 0; row < data.size(); row++) {
			for (int col = 0; col < data.get(row).size(); col++) {
				System.out.print(data.get(row).get(col) + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		// create and display a database full of random aliens
		AlienDatabase db = new AlienDatabase();
		for (int i = 0; i < 100; i++) {
			int numHeads = (int)(Math.random() * 10) + 1;
			String name = makeRandomString();
			db.addAlien(new Alien(numHeads, name));
		}
		db.displayDatabase();
		
	}
	
	private static Random random = new Random();
	
	public static String makeRandomString() {
		StringBuffer answer = new StringBuffer();
		int length = random.nextInt(10) + 3;
		for (int i = 0; i < length; i++) {
			answer.append(getRandomCharacter());
		}
		return answer.toString();
	}
	
	private static char getRandomCharacter() {
		return (char)(random.nextInt(26) + 'A');
	}
}
