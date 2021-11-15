package Triangle;
public class Isosceles extends Triangle{

	 

    private double height;

   //Constructor – Calls the constructor from the superclass

   //and initializes height



public Isosceles(double base, double side)

{

         super(base,side,side);
         height=calcHeight();

    }



   //Calculates the height of the isosceles Triangle

public double calcHeight()

    {

          return Math.sqrt(side2*side2+side1*side1/4);

    }



   // Calculate the Area of the isosceles triangle

    public double Area()

    {

          return side1*height/2;

    }

}

