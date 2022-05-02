
public class Driver {

	public static void main(String[] args) {
		
		Warrior a = new Warrior("Aryan", 100, 100);
		Warrior b = new Warrior("Arnav", 90, 90);
		Warrior c = new Warrior("Ritu", 80, 80);
		Warrior d = new Warrior("Vikas", 70, 70);
		
		Warrior.tournament(a,b,c,d);
		
		
	}

}
