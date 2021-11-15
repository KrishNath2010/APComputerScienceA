import java.util.Scanner;
public class cando {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if (number<16)
			System.out.println("You can't drive.");
		else
		{
			if (number<18)
				System.out.println("You can't vote.");
			else
			{
				if (number<22)
					System.out.println("You can't drink.");
				else
				{
					if (number<25)
						System.out.println("You can't rent a car.");
					else
					{
						System.out.println("You can do anything that is legal.");
					}
				}
			}
		}
						
						

	}

}
