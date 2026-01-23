import java.util.Scanner;
public class CircleWithMathods
{
	public static double CalculateCircumference(double r)
	{
		return 2*3.14*r;
	}
	
	public static double CalculateArea(double r)
	{
		return 3.14*r*r;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		double r = sc.nextDouble();
		
		double circ = CalculateCircumference(r);
		double area = CalculateArea(r);
		
		System.out.println("Area of the circle is: "+ area);
		System.out.println("Circumference of the circle is: "+ circ);
	}
}