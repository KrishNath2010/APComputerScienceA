
public class GradeAverage {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(92,"bob");
		if (s1.getAvg()>s2.getAvg())
		{
			System.out.println("Student " + (s1.getName()) + " has the highest average of " +(s1.getAvg())); 
		}
		else if (s2.getAvg()>s1.getAvg())
		{
			System.out.println("Student " + (s2.getName()) + " has the highest average of " +(s2.getAvg()));
		}
		else
		{
			System.out.println("Students " + (s2.getName()) + " and " + (s1.getName()) + " have the same average of " +(s2.getAvg()));
		}

	}

}
