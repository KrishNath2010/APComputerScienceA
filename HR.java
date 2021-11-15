
public class HR {

	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		System.out.println(e1.to_String());
		e1.set_Salary(80000);
		System.out.println(e1.get_firstName() + "'s salary now is " + e1.get_Salary() + ".");
		Employee e2 = new Employee("B96",100000000,"Bob","Alex");
		System.out.println(e2.get_firstName() + " " + e2.get_id());
	}
}         