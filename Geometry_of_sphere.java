
public class Geometry_of_sphere {

	public static void main(String[] args) {
		Sphere s1 = new Sphere();
		System.out.println("sphere 1 radius " + s1.get_radius());
		System.out.println("sphere 1 volume " + s1.calculate_volume());
		System.out.println("sphere 1 area " + s1.calculate_sutface_area());
		Sphere s2 = new Sphere(0,0,1,0);
		System.out.println("sphere 2 radius " + s2.get_radius());
		System.out.println("sphere 2 volume " + s2.calculate_volume());
		System.out.println("sphere 2 area " + s2.calculate_sutface_area());

	}

}
