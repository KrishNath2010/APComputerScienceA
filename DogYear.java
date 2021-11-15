import java.util.Scanner;

public class DogYear {

	public static void main(String[] args) {
		System.out.println("Give years");
		Scanner in = new Scanner(System.in);
		int years = in.nextInt();
		if (years<0)
		{
			System.out.println("error");
		}
		else if (years>2)
		{
			System.out.println(((years-2)*4)+21);
		}
		else
		{
			System.out.println(years*10.5);
		}

	}

}
