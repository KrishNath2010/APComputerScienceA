import java.util.Scanner;
public class q_16 {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();	
		double ans=0;
		for (int i =1;i<=num;i++) {
			if (ans%2!=0) {
				ans+=1/i;
			}
			else {
				ans-=1/i;
			}
		}
		System.out.println(ans);
		

	}

}