import java.util.Scanner;
public class highAndLow {

	public static void main(String[] args) {
		int high=94;
		int low=27;
		System.out.println("Give tempreture");
		Scanner in = new Scanner(System.in);
		int temp = in.nextInt();
		if (temp>high)
			high=temp;
		if (temp<low)
			low=temp;
		System.out.println("high is "+ high);
		System.out.println("low is "+
		low);
		

	}

}
