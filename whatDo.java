import java.util.Scanner;
public class whatDo {

	public static void main(String[] args) {
		System.out.println("Enter tempreture");
		Scanner in = new Scanner(System.in);
		int tempreture = in.nextInt();
		if (tempreture<40)
			System.out.println("skiing");
		else
		{
			if (tempreture<60)
				System.out.println("golf");
			else
			{
				if (tempreture<80)
					System.out.println("tennis");
				else
					System.out.println("swimming in the lake");
			}
		}
	}

}
