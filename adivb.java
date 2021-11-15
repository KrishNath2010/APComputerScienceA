
public class adivb {

	public static void main(String[] args) {
		int a=1;
		int b=3;
		boolean notdiv=true;
		while ((notdiv)&&(a<=b)) {
			if (a%6!=0) {
				System.out.println(a);
			}
			else {
				notdiv=false;
			}
			a++;
			
		}

	}

}
