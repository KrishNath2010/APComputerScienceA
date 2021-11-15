import java.util.Scanner;

public class sum_sqare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ans=0;
		int current=0;
		for (int i=0;i<5;i++) {
			System.out.println("enter grade");
			current = in.nextInt();
			ans+=current*current;
			
		}
		System.out.println(ans);

	}

}

