package shapes;


public class Triangle extends Rectangle
{


    public Triangle(double width, double height)
    {
        super(width, height);
    }
    public double getArea()
    {
        return (getWidth() * getHeight())/2;
    }
}
