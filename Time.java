
public class Time {
	private int seconds;
	public Time() {
		seconds=10000;
	}
	public Time(int s) {
		seconds=s;
	}
	public int calcHours() {
		return seconds/3600;
	}
	public int calcMinutes(int s) {
		return s/60;
	}
	public int calcSeconds(int s) {
		return s;
	}
}
