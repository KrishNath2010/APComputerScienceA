package Triangle; 
public class MyMathClass {
	public static double power(double x, int y) {
		double ans=1;
		for (int i=0;i<y;i++) {
			ans*=x;
		}
		return ans;
	}
	public static long factorial(int n) {
		long ans=0;
		for (int i=1;i<=n;i++) {
			ans*=i;
		}
		return ans;
	}
	public static double sin(double x) {
		double ans=0;
		double den=0;
		double num=0;
		for (int i=0;i<=20;i++) {
			den=factorial(2*i+1);
			num=(power(-1,i)*power(x,2*i+1));
			ans+=num/den;
		}
		return ans;
	}
}
