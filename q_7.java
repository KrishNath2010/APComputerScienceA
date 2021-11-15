import java.util.Scanner;

public class q_7 {

	public static void main(String[] args) {
		int ev=0;
		int od=0;
		Scanner in = new Scanner(System.in);
		for () {
			System.out.println("Enter number");
			int num = in.nextInt();	
			if (num%2==0) {
				ev+=num;
			}
			else {
				od+=num;
			}
		}
		System.out.println(ev);
		System.out.println(od);

	}

}
