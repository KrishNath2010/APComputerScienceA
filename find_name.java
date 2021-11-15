import java.util.Scanner;

public class find_name {

	public static void main(String[] args) {
		System.out.println("Give email");
		Scanner in = new Scanner(System.in);
		String email = in.nextLine();
		String name = email.substring(0, email.indexOf("@"));
		System.out.println("Username:");
		System.out.println(name);
		String com = email.substring(email.indexOf("@")+1, email.indexOf("."));
		System.out.println("Sever");
		System.out.println(com);
		String type = email.substring(email.indexOf(".")+1);
		System.out.println("Domain");
		System.out.println(type);

	}

}
