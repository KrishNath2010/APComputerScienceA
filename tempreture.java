import java.util.Scanner;

public class tempreture {

	public static void main(String[] args) {
		int largest=0;
		int smallest=Integer.MAX_VALUE;
		Scanner in = new Scanner(System.in);
		System.out.println("How many days temperature");
		int g = in.nextInt();
		double sum=0;
		for (int i=1;i<=g;i++) {
			System.out.println("Day " + i + " temp: ");
			int num = in.nextInt();	
			sum+=num;
			if (num>largest) {
				largest=num;
			}
			if (num<smallest) {
				smallest=num;
			}
		}
		double avg=sum/g;
		System.out.println("Average temp:"+avg);
		System.out.println("Maximum was"+largest);
		System.out.println("Minimum was "+smallest);

	}

}                    
