package Triangle;

public class Triangle {
	protected double side1;
	protected double side2;
	protected double side3;
	public Triangle(double a , double b, double c) {
		side1=a;
		side2=a;
		side3=a;
	}
	protected final double Perimeter() {
		return side1+side2+side3;
	}
	protected double Area() {
		double angle=Math.acos((side1*side1-side2*side2-side3*side3)/(-2*side2*side3));
		return (side2*side3*MyMathClass.sin(angle))/2;		
	}
	public String toString() {
		return ("This triangle has sides "+side1+side2+side3+" with perimeter"+Perimeter()+" and area "+ Math.round(Area()*100)/100);
	}
}

