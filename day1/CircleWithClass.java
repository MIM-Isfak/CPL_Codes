public class CircleWithClass
{
    private double radius;
	private String color;

	public CircleWithClass()
	{
		this.color=color;
	}
    public CircleWithClass(String color, double radius) 
	{
		this.color = color;
        this.radius = radius;
    }

	public String getColor() 
	{
        return color;
    }
    public double getRadius() 
	{
        return radius;
    }
	public void setColor(String Color)
	{
		this.color = color;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
    public double getArea() 
	{
        return Math.PI * radius * radius;
    }

    public double getCircumference() 
	{
        return 2 * Math.PI * radius;
    }
}
