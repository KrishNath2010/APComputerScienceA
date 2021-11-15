
public class LabCalcIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle = 250000;
		double annualRate = 4.85;
		double numYears = 30;
		double p = principle;
		double r = (annualRate/12)/100;
		double n = numYears*12;
		double mp = ((r*Math.pow(1+r,n))/((Math.pow(1+r,n))-1))*p;
		System.out.println("Principle: "+principle);	
		System.out.println("Annual Rate: "+annualRate+"%");	
		System.out.println("Number of Years: "+numYears);	
		System.out.println("Montly Payment: $"+mp);	
		System.out.println("Total Payment: $"+mp*numYears*12);
		System.out.println("Total Interest: $"+(mp*numYears*12-principle));
		

	}

}
