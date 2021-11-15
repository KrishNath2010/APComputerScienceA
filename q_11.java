import java.util.Scanner;
public class q_11 {

	public static void main(String[] args) {
		int neg=0;
		int zero=0;
		int pos=0;
		Scanner in = new Scanner(System.in);
		for (int i=0;i<20;i++) {
			System.out.println("Enter number");
			int num = in.nextInt();	
			if (num>0) {
				pos+=1;
			}
			else if (num==0) {
				zero+=1;
			}
			else {
				neg+=1;
			}
		}
		System.out.println(pos);
		System.out.println(neg);
		System.out.println(zero);

	}

}
