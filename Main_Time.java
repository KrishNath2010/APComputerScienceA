public class Main_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 10000/1;
		Time t1 = new Time(s);
		System.out.println("Hours: " + t1.calcHours());
		s%=3600;
		System.out.println("Minutes: " + t1.calcMinutes(s));
		s%=60;
		System.out.println("Seconds: " + t1.calcSeconds(s));
	}

}
