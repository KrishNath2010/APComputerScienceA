package Triangle;
public class Triangles {

	 

    public static void main(String[] args)

    {    

          Triangle triangle1 = new Triangle(3, 4, 6);

          System.out.println(triangle1);

          Isosceles triangle2 = new Isosceles(1, 2);

          System.out.println(triangle2);

          Equilateral triangle3 = new Equilateral(2);

          System.out.println(triangle3);

          Right triangle4 = new Right(3, 4);

          System.out.println(triangle4);

    }

}