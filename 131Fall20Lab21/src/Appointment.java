
public class Appointment {

	private int day;
	private String time, description;
	
	public Appointment(int day, String time, String description) {
		
		this.day = day;
		this.time = time;
		this.description = description;
		
	}
	
	public int getDay() {
		
		return this.day;
		
	}
	
	public String getTime() {
		
		return this.time;
		
	}

	public String getDescription() {
		
		return this.description;
		
	}
	
}
