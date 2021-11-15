public class q_3 {

	public static void main(String[] args) {
		int num = (int) (((Math.random())*99)+1);
		boolean is_prime=true;
		for(int i=2;i<=num/2;i++) {
			if (num%i==0) {
				is_prime=false;
			}
		}
	if (is_prime){
		System.out.println("It is prime");
	}
	else {
		System.out.println("It is not prime");
	}

	}

}
