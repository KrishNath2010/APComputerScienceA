import java.util.Scanner;
public class calc_avg {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter number");
		int t = in.nextInt();	
		for (int i=0;i<t;i++) {
			System.out.println("Enter number");
			int num = in.nextInt();	
			sum+=num;
		}	
		double avg = sum/t;
		System.out.println(avg);
	}

}
