package shapes;


public class Rectangle extends Shape
{
    private double height;


    public Rectangle(double width, double height)
    {
        super(width);
        this.height = height;   
    }
    public double getHeight()
    {
        return height;
    }
    public double getArea()
    {
        return getWidth() * height;
    }
}
