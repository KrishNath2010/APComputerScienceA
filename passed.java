
import java.util.Scanner;

public class passed {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int Pass=60;
		int fail=0;
		int passed=0;
		int current=9;
		while (current>=0) {
			System.out.println("enter grade");
			current = in.nextInt();
			if (current>=Pass) {
				System.out.println("passed");
				passed++;
			}
			else if (current>=0) {
				System.out.println("failed");
				fail++;
			}
			
		}
		System.out.println("failed people count is " + fail);
		System.out.println("passed people count is " + passed);

	}

}

