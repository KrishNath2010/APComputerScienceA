import java.util.Scanner;
public class pg97_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int Pass=60;
		int passed=0;
		float avg=0;
		float high=0;
		int current;
		System.out.println("enter number of people");
		int num = in.nextInt();
		for  (int i=0;i<num;i++) {
			System.out.println("enter grade");
			current = in.nextInt();
			System.out.println("enter second grade");
			current += in.nextInt();
			current/=2;
			if (current>=Pass) {
				passed++;
			}
			avg+=current;
			if (current>high) {
				high=current;
			}
			
		}
		
		System.out.println("average is " + avg/num);
		System.out.println("passed people count is " + passed);
		System.out.println("highest average is " + high);

	}

}
