package inheritanceExample;

public class AlarmClock extends Clock {
	public int alarmHours, alarmMins, alarmSeconds;
	
	public void setAlarm(int h, int m, int s) {
		
	}
	
	public void makeSounds() {
		
	}
	
	@Override
	public void tick() {
		System.out.println("alarm clock kind of tick");
	}
	
	public void tick(int volume) {
		
	}
	
}
