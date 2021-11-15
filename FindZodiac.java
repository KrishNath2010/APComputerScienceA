import java.util.Scanner;

public class FindZodiac {

	public static void main(String[] args) {
		System.out.println("Give year");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int use = year%12;
		if (year<1960)
		{
			System.out.println("error");
		}
		else if (year>2019)
		{
			System.out.println("error");
		}
		else if (use==0)
		{
			System.out.println("Monkey");
		}
		else if (use==1)
		{
			System.out.println("Rooster");
		}
		else if (use==2)
		{
			System.out.println("Dog");
		}
		else if (use==3)
		{
			System.out.println("Pig");
		}
		else if (use==4)
		{
			System.out.println("Rat");
		}
		else if (use==5)
		{
			System.out.println("Ox");
		}
		else if (use==6)
		{
			System.out.println("Tiger");
		}
		else if (use==7)
		{
			System.out.println("Rabbit");
		}
		else if (use==8)
		{
			System.out.println("Dragon");
		}
		else if (use==9)
		{
			System.out.println("Snake");
		}
		else if (use==10)
		{
			System.out.println("Horse");
		}
		else if (use==11)
		{
			System.out.println("Goat");
		}

	}

}
