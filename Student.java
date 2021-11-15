
public class Student {
	private int avg;
	private String name;
	public Student()
	{
		avg=85;
		name="Krish";	
	}
	public Student(int a,String n)
	{
		avg=a;
		name=n;	
	}
	public int getAvg()
	{
		return avg;
	}
	public String getName()
	{
		return name;
	}
	public void setAvg(int a)
	{
		avg=a;
	}
	public void setName(String n)
	{
		name=n;
	}
}
