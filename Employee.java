
public class Employee {

	private  String id;
	private  int Salary;
	private  String firstName;
	private  String lastName;
	public Employee()
	{
		id="A101";
		Salary=78000;
		firstName="Katie";
		lastName="Jhonson";				
	}
	public Employee(String i , int s , String f , String l)
	{
		id=i;
		Salary=s;
		firstName=f;
		lastName=l;			
	}
	String get_id()
	{
		return id;
	}
	void set_id(String i)
	{
		id=i;
	}
	int get_Salary()
	{
		return Salary;
	}
	void set_Salary(int s)
	{
		Salary=s;
	}
	String get_firstName()
	{
		return firstName;
	}
	void set_firstName(String f)
	{
		firstName=f;
	}
	String get_lastName()
	{
		return lastName;
	}
	void set_lastName(String f)
	{
		lastName=f;
	}
	String to_String()
	{
		return "Employee " + firstName + " " + lastName + " makes " + Salary + " a year.";
	}
		
}
