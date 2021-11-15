package input;
import java.util.Scanner;


public class cal_avg {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give score 1");
		double a1 = in.nextInt();
		System.out.println("Give score 2");
		double a2 = in.nextInt();
		System.out.println("Give score 3");
		double a3 = in.nextInt();
		double avg = ((a1+a2+a3) / 3.00);
		if (avg<=59)
		{
			System.out.println("Student received a final grade of F and has not passed the course.");
		}
		else if (avg<=69)
		{
			System.out.println("Student passed the course with a final grade of D.");
		}
		else if (avg<=79)
		{
			System.out.println("Student passed the course with a final grade of C.");
		}
		else if (avg<=89)
		{
			System.out.println("Student passed the course with a final grade of B.");
		}
		else
		{
			System.out.println("Student passed the course with a final grade of A.");
		}

	}

}
