// You need to develop a module for a graphics application that manages different 
// shapes using an interface. Implement classes for shapes (e.g., Circle, Rectangle, 
// Triangle) and use an interface for common methods like draw() and getArea(). 
interface Shape{
    void show();
    double getArea();
}
class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }
    
    public void show(){
        System.out.println("Drawing circle with radius: "+radius);
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
class Rectangle implements Shape{
    private double length;
    private double breath;

    public Rectangle(double length,double breath) {
        this.breath=breath;
        this.length=length;
    }
    
    public void show(){
        System.out.println("Drawing recatngle with length: "+length+" breath: "+breath);
    }
    public double getArea(){
        return length*breath;
    }
}
class Triangle implements Shape{
    private double height;
    private double base;

    public Triangle(double height,double base) {
        this.base=base;
        this.height=height;
    }
    
    public void show(){
        System.out.println("Drawing triangle with height: "+height+" base: "+base);
    }
    public double getArea(){
        return 0.5*height*base;
    }
}
public class P4_ShapeMgmt {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.show();
        System.out.println("Area of circle is: "+circle.getArea()+"\n");

        Rectangle rect = new Rectangle(5, 4);
        rect.show();
        System.out.println("Area of Rectanle is: "+rect.getArea()+"\n");

        Triangle tri = new Triangle(5, 4);
        tri.show();
        System.out.println("Area of Triangle is: "+tri.getArea()+"\n");
    }
}
