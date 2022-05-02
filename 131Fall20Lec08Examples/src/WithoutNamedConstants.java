import java.util.Scanner;

/* This program will calculate how long it would take for radio communication to
 * reach a distant space ship.
 */
public class WithoutNamedConstants {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("How far away is your spaceship (miles)?");
		long milesToShip = keyboardInput.nextLong();
		double timeForCommunication = milesToShip / 670616629.0 * 3600;
		System.out.println("Time for communication to your ship (seconds) " + 
		                    timeForCommunication);
		
		keyboardInput.close();
	}

}
