
public class pri_stop {

	public static void main(String[] args) {
		String s="It is a bad day";
		int postion=0;
		while ((postion<s.length())&&(s.charAt(postion)!='b')) {
			System.out.print(s.charAt(postion));
			postion++;
			
		}

	}

}
