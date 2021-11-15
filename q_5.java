import java.util.Scanner;
public class q_5 {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();	
		System.out.println("Enter second number");
		int power = in.nextInt();	
		int ans=1;
		for (int i=1;i<=power;i++) {
			ans*=num;
		}
		System.out.println(ans);
	}

}
