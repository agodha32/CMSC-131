package clockWithCorrectEquals;


public class Clock {

	public int hours, mins, seconds;
	
	public void setTime(String time) {  // "2:55:28PM"
		
	}
	
	public String getTime() {
		return null;
	}
	
	public void tick() {
		System.out.println("TICK!");
	}
	
	/* Correct equals method */
	@Override
	public boolean equals(Object other) {
		if ( !(other instanceof Clock)) {
			return false;
		}
		Clock c = (Clock)other;
		return hours == c.hours && mins == c.mins && seconds == c.seconds;
	}
	
}
