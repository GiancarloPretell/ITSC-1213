package shapes;


public class Main {


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0,6.0);
        Triangle t1 = new Triangle(7.0, 8.0);
        System.out.println("Area of a rectangle " + r1.getArea());
        System.out.println("Area of a triangle " + t1.getArea());
    }


}
