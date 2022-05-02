
public class Warrior {
	
	String name;
	int strength, healthLevel;
	
	public Warrior(String namein, int strengthin, int healthLevelin) {
		
		name = namein;
		strength = strengthin;
		healthLevel = healthLevelin;
		
	}

	public Warrior(String namein) {
		
		name = namein;
		strength = 10;
		healthLevel = 200;
		
	}
	
	public Warrior(Warrior other) {
		name = other.name;
		strength = other.strength;
		healthLevel = other.healthLevel;
	
	}
	
	public boolean isAlive(int healthlevel) {
		
		return healthlevel > 0;
		
	}
	
	public String smite(Warrior other) {
		
		other.healthLevel = other.healthLevel - strength;
		
		return (name + " has smitten " + other.name + ", doing " + strength 
				+ " points of damage!");
		
	}
	
	public boolean equals(Warrior other) {
		
		return (other.name.contentEquals(name) && other.strength == strength);
		
	}
	
	public String toString() {
		
		return (name + " - Strength: " + strength + ", Health: " + healthLevel);
		
	}

	public static Warrior fight(Warrior one, Warrior two) {
		
		while (one.healthLevel > 0 && two.healthLevel > 0) {
			
			one.smite(two);
			if (two.healthLevel < 0) {
				
				System.out.println(one.name + " has won!!!");
				return one;
			}
			
			two.smite(one);
			if (one.healthLevel < 0) {
				
				System.out.println(two.name + " has won!!!");
				return two;
				
			}
			
		}
		
		return null;

	}
	
	public static Warrior tournament(Warrior a, Warrior b, Warrior c, Warrior d ) {
		
		Warrior winnerOne = fight(a, b);
		Warrior winnerTwo = fight(c, d);
		
		return fight(winnerOne, winnerTwo);
		
	}
}
