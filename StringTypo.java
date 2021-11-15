import java.util.Scanner;
public class StringTypo {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner in = new Scanner(System.in);
		String get = in.nextLine();
		int away=(int)(Math.random()*(int)get.length());
		System.out.println(get.substring(0,away) + get.substring(away+1));
		

	}

}
