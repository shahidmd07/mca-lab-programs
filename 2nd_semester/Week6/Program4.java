//  Shape Management

interface Shapes
{
    void area();
    void draw();
}
class Circle implements Shapes
{
    float radius;
    Circle(float radius){
        this.radius = radius;
    }
    public void area(){
        System.out.println("Circle area: "+radius*radius*3.1415f);
    }
    public void draw(){
        System.out.println("Circle is drawing...");
    }
}
class Rectangle implements Shapes
{
    float width;
    float height;
    Rectangle(float width,float height )
    {
        this.width= width;
        this.height = height;
    }
   public void area()
   {
        System.out.println("Rectangle area: "+ (width*height));
    }
    public void draw()
    {
        System.out.println("Rectangle is drawing...");
    }
}
class Triangle implements Shapes
{
    float base;
    float height;
    Triangle(float base,float height )
    {
        this.base= base;
        this.height = height;
    }
    public void area()
    {
        System.out.println("Triagle area: "+ ((base*height)/2));
    }
    public void draw()
    {
        System.out.println("Triagle is drawing...");
    }
}
class Program4 
{
    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        Shapes circle = new Circle(5);
        Shapes triangle = new Triangle(5,3);
        Shapes rectangle = new Rectangle(5,4);
        circle.area();
        triangle.area();
        rectangle.area();
        
    }
}