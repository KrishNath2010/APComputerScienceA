import java.util.Scanner;

public class calcmaxmin {

	public static void main(String[] args) {
		int largest=0;
		int smallest=Integer.MAX_VALUE;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int g = in.nextInt();	
		for (int i=0;i<g;i++) {
			System.out.println("Enter number");
			int num = in.nextInt();	
			if (num>largest) {
				largest=num;
			}
			if (num<smallest) {
				smallest=num;
			}
		}
		System.out.println(largest);
		System.out.println(smallest);

	}

}
