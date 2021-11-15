import java.util.Scanner;
public class q_15 {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();	
		double ans=0;
		for (int i =1;i<=num;i++) {
			ans+=1/i;
		}
		System.out.println(ans);
		

	}

}
