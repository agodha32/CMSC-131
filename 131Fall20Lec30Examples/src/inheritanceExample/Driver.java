package inheritanceExample;

public class Driver {

	public static void main(String[] args) {
		AlarmClock ac = new AlarmClock();
		ac.hours = 10;
		ac.setTime("10:55:01AM");
		ac.tick();
	}
	

}
