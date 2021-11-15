package Triangle;
public class Right extends Triangle{

	 

	//Constructor – Calls the constructor from the superclass        

	public Right(double leg1, double leg2) {
		super(leg1,leg2,Math.sqrt(leg1*leg1+leg2*leg2));

	      }

	 

	      // should return the Area of a right triangle

	public double Area()

	      {

	            return side1*side2/2;

	      }

	}

	 