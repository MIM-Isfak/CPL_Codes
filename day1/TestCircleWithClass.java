public class TestCircleWithClass
{
	public static void main(String args[])
	{
		CircleWithClass c1 = new CircleWithClass();
		CircleWithClass c2 = new CircleWithClass("blue", 7.5);
		
		System.out.println("Circle colour : "+ c2.getColor());
		System.out.println("Area : "+ c2.getArea());
		System.out.println("Circumference : "+ c2.getCircumference());
	}
}