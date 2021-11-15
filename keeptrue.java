import java.util.Scanner;

public class keeptrue {

	public static void main(String[] args) {
		System.out.println("Give big number");
		Scanner in = new Scanner(System.in);
		int big = in.nextInt();
		System.out.println("Give small number");
		int small = in.nextInt();
		if (big<small)
		{
			int small_1=big;
			big=small;
			small=small_1;
		}
		System.out.println("largerValue is greater than smallerValue");
	}

}
