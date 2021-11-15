
public class APTriangle {
	private int a;
	private int c;
	private int b;
	public APTriangle(int ap, int bp, int cp)
	{
		a=ap;
		b=bp;
		c=cp;
	}
	public int getPerimeter()
	{
		return a+b+c;
	}
	public String isRight()
	{
		if (c==Math.sqrt(a*a + b*b))
			return "yes";
		return "no"; 
	}
}
