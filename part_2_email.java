
import java.util.Scanner;

public class part_2_email {

	public static void main(String[] args) {
		System.out.println("Give email");
		Scanner in = new Scanner(System.in);
		String email = in.nextLine();
		String type = email.substring(email.indexOf(".")+1);
		if ((type=="org") || (type=="edu")){
			System.out.println("Thank you for correct type for email");
		}
		else {
			System.out.println(" incorrect type Give diffrent email " + type);
			email = in.nextLine();
			type = email.substring(email.indexOf(".")+1);
			if ((type!="org") || (type!="edu")){
				System.out.println("Please get the correct type of email Goodbye!");
			}
			
		}

	}

}