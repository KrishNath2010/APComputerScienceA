public class Sphere {

	private double radius ;
	public Sphere() {
		radius=5;
	}
	public Sphere(double x_c,double y_c,double y_p,double x_p) {
	radius = Math.sqrt((x_c-x_p)*(x_c-x_p) + (y_c - y_p)*(y_c - y_p));
	}
	public double get_radius() {
		return radius;
	}
	public double calculate_volume() {
		return ((double)4/3*Math.PI*radius*radius*radius);
	}
	public double calculate_sutface_area() {
		return (4*Math.PI*radius*radius);
	}
}
