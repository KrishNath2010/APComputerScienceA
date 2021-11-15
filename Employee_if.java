
public class Employee_if {
	 private float HoursWorked;
	 private float HourSalary;
	 private String Name;
	 public Employee_if() {
		 Name="Jhon Smith";
		 HoursWorked=40;
		 HourSalary=20;
	 }
	 public Employee_if(String n,float w, float s) {
		 Name=n;
		 HoursWorked=w;
		 HourSalary=s;
	 }
	 public String get_name() {
		 return Name;
	 }
	 public void set_name(String s) {
		 Name=s;
	 }
	 public void set_hw(float s) {
		 HoursWorked=s;
	 }
	 public void set_hs(float s) {
		 HourSalary=s;
	 }
	 public float calcGrossSlary() {
		 return HoursWorked*HourSalary; 
	 }
	 public float SSDiscount() {
		 float income=calcGrossSlary();
		 float ans=0;
		 if ((1200<=income) && (income<=2500))
		 {
			 ans=10;
		 }
		 else if (income>2500){ 
			 ans=18;
		 }
		 return ans;
	 }
	 public float TaxDiscount() {
		 float income=calcGrossSlary();
		 float sum=1;
		 float ans=0;
		 if ((800<income) && (income<=1600))
		 {
			 ans=10;
		 }
		 else if ((1600<income) && (income<=3000))
		 {
			 ans=15;
		 }
		 else if (income>=3000){ 
			 ans=25;
		 }
		 sum=ans*(income-(income*SSDiscount()/100));
		 return sum;
	 }
	 public float calcNet() {
		 return calcGrossSlary()-(TaxDiscount()+(calcGrossSlary()-(calcGrossSlary()*SSDiscount()/100)));
	 }
	 
}
