import java.util.Scanner;

public class StringYourSub {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner in = new Scanner(System.in);
		String get = in.nextLine();
		System.out.println("Your String has lenth of " + get.length() + ". Enter the numbers you want to look bweeteen");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("The part of the String bweeteen " + a + " and " + b +" is: " + get.substring(a-1,b));

	}

}
