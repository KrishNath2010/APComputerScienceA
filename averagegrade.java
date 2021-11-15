import java.util.Scanner;

public class averagegrade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float sum=0;
		float avg=0;
		int count=0;
		int current=1;
		while (current>=0) {
			System.out.println("enter grade");
			current = in.nextInt();
			if (current>=0) {
				sum+=current;
				count+=1;
			}
		}
		if (count!=0) {
			avg=sum/count;
			System.out.println("average is "+avg);
		}

	}

}
