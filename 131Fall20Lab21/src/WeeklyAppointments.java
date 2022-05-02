
public class WeeklyAppointments {
	
	public Appointment[][] appointments;
	
	public WeeklyAppointments() {
	
	appointments = new Appointment [7][0];
	
	}
	
	public void addAppointment(Appointment app) {
		
		int tempDay = app.getDay();
		 	
		Appointment [] temp = new Appointment [appointments[tempDay].length + 1];
		
		for(int num = 0; num < appointments[tempDay].length; num++) {
			
			temp[num] = appointments[tempDay][num];
			
		}
		
		temp[appointments[tempDay].length] = app;
		
		appointments[tempDay] = temp;
		
	}
	
	public Appointment[] getAppointments(int day) {
		
		return appointments[day];
		
	}


	
}
