import java.util.Scanner;

public class pg97_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int low=0;
		int high=0;
		int sum=0;
		System.out.println("enter salary");
		int current=in.nextInt();
		float num=0;
		while (current>=0) {
			if (current>high) {
				high=current;
			}
			else if (current<low) {
				low=current;
			}
			sum+=current;
			num+=1;
			System.out.println("enter salary");
			current = in.nextInt();
		}
		System.out.println("highest is " + high);
		System.out.println("lowest is " + low);
		System.out.println("average is " + sum/num);
		System.out.println("amount spent is " + sum);

	}

}
