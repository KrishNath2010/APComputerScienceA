package Cat;


public class main_cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c1 = new cat();
		System.out.println("The cat's name is " + c1.get_name() + ".");
		System.out.println(c1.get_name() + " has " + c1.get_num_of_lives() + " lives.");
		cat c2 = new cat("Felix", 9);
		System.out.println("The cat's name is " + c2.get_name() + ".");
		System.out.println(c2.get_name() + " has " + c2.get_num_of_lives() + " lives.");
		System.out.println(c1.get_name() + " and " + c2.get_name() + " have a fight.");
		c1.set_num_of_lives(c1.get_num_of_lives() - 1);
		System.out.println(c1.get_name() + " has " + c1.get_num_of_lives() + " lives.");
		cat c3 = new cat("Fred", 2);
		System.out.println(c3.get_name() + " is going to die.");
		
		
	}

}
