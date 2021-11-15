import java.util.Scanner;
public class guess {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int limit=5;
		int num=(int)((Math.random()*49)+1);
		System.out.println(num);
		System.out.println("I have chosen a number bwetween 1 and 50. Try to guess it !");
		System.out.println("Your guess:");
		int current=in.nextInt();
		int g=1;
		while ((current!=num) && (g!=limit)) {
			System.out.println("That is incorrect Try again");
			System.out.println("Your guess:");
			current=in.nextInt();
			g+=1;
		}
		if (g!=limit) {
			System.out.println("That's right! you are a good guesser.");
		}
		else {
			System.out.println("sorry play again");
		}
	}
}
