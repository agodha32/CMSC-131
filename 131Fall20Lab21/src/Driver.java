import java.util.Random;

public class Driver {

	private static String[] tasks = {"Walk Dog", "Eat", "Doctor appointment", 
			"Study hour", "Brush teeth", "Fight monsters", "Watch TV", "Bowling", 
			"Gardening Club", "Violin practice", "Do laundry", "Call Mom", 
			"Bake cake", "Repair fence", "Do dishes", "Exercise", "Brain surgery",
			"Make tacos", "Feed fish", "Check email", "Storm castle", 
			"Scavenger hunt", "Bike ride"};
	
	public static void main(String[] args) {
		final int SEED = 12341234;
		Random random = new Random(SEED);
		WeeklyAppointments calendar = new WeeklyAppointments();
		for (int i = 0; i < tasks.length; i++) {
			int day = random.nextInt(7);
			int hour = random.nextInt(12) + 1;
			int minute = random.nextInt(60);
			boolean morning = random.nextBoolean();
			String description = tasks[(i * 13) % tasks.length];
			String AMPM = morning? "AM" : "PM";    // we'll learn ?: operator soon
			String time = hour + ":" + (minute < 10? "0" : "") + minute + AMPM;
			calendar.addAppointment(new Appointment(day, time, description));
		}
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday"};
		for (int i = 0; i < 7; i++) {
			System.out.println(days[i]);
			Appointment[] row = calendar.getAppointments(i);
			for (Appointment app : row) {
				System.out.println(app.getTime() + " " + app.getDescription());
			}
			System.out.println();
		}
	}

}
