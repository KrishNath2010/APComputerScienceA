import java.util.Scanner;

public class calPrice {

	public static void main(String[] args) {
		System.out.println("Give air time");
		Scanner in = new Scanner(System.in);
		int minutes = in.nextInt();
		System.out.println("Give texts");
		int text = in.nextInt();
		float cost=15;
		System.out.println(cost);
		if (minutes>50)
		{
			cost+=(minutes-50)*0.25;
			System.out.println((minutes-50)*0.25);
		}
		if (text>50)
		{
			cost+=(text-50)*0.44;
			System.out.println((text-50)*0.44);
		}
		cost+=0.44;
		System.out.println(0.44);
		cost=cost*21/20;
		System.out.println(cost/21);
		System.out.println(cost);
		
	}

}
