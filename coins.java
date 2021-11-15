
public class coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cents=42;
		System.out.println("Quater(s) " + cents/25);
		cents%=25;
		System.out.println("Dime(s) " + cents/10);
		cents%=10;
		System.out.println("Nickel(s) " + cents/5);
		cents%=5;
		System.out.println("Penny(s) " + cents/1);
		cents%=1;
		

	}

}
