import java.util.Scanner;

/* This program will calculate how long it would take for radio communication to
 * reach a distant space ship.
 */
public class WithNamedConstants {

	public static void main(String[] args) {
		
		/* Named Constants */
		final double SPEED_OF_LIGHT_MPH = 670616629;
		final int SECONDS_PER_HOUR = 3600;
		final String INITIAL_PROMPT = 
				"How far away is your spaceship (miles)?  ";
		final String FINAL_MESSAGE = 
				"Time for communication to your ship (seconds): ";

		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print(INITIAL_PROMPT);
		long milesToShip = keyboardInput.nextLong();
		double secondsForCommunication = milesToShip / SPEED_OF_LIGHT_MPH * SECONDS_PER_HOUR;
		System.out.println(FINAL_MESSAGE + secondsForCommunication);
		
		keyboardInput.close();
	}

}
