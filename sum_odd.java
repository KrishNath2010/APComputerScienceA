import java.util.Scanner;

public class sum_odd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ans=0;
		int current=0;
		for (int i=0;i<20;i++) {
			System.out.println("enter grade");
			current = in.nextInt();
			if (current%2==1) {
				ans+=current;
			}
			
		}
		System.out.println(ans);

	}

}

