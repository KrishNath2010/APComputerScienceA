package rectangle;

public class rectangle {
// Instance variables
	private double length; 
	private double width; 
	private double area;
// Initialize variables
	public rectangle(){
		length = 10;
		width = 5.5;
	}
	public rectangle(double l, double w){
		length = l;
		width = w;
	}
	public double get_length() {
		return length;		
	}
	public double get_width() {
		return width;		
	}
	public void set_length(double l) {
		length = l;		
	}
	public void set_width(double w) {
		width = w;		
	}
	public double calculate_area() {
		area = length*width;
		return area;		
	}
	
	
	
}
