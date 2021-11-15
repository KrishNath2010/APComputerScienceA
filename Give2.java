import java.util.Scanner;
public class Give2 {

	public static void main(String[] args) {
		System.out.println("Give two numbers");
		Scanner in = new Scanner(System.in);
		int f = in.nextInt();
		int s = in.nextInt();
		if (f%s==0)
			System.out.println("It is a multiple");
		else
			System.out.println("It is not a multiple");
		if (f>s)
			System.out.println(f-s);
		else
			System.out.println(s-f);

	}

}
