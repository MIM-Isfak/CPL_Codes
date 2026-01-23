import java.util.Scanner;
public class TestMain
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Circle c1 = new Circle();
		System.out.print("Enter the radius of the circle: ");
		c1.radius = sc.nextDouble();
		
		System.out.println("Area of the circle is: "+ c1.getArea());
		System.out.println("Circumference of the circle is: "+ c1.getCircumference());
	}
}