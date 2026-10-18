import java.util.*;

interface Shape {
    void draw();
    void area();
}

class Circle implements Shape {
    double r;

    public void setRadius(Scanner sc) {
        System.out.print("enter a radius of circle: ");
        this.r = sc.nextDouble();
    }

    public void area() {
        double circleArea = Math.PI*(Math.pow(r, 2));
        System.out.println(circleArea);
    }

    public void draw() {
        System.out.println("Drawing Circle...");
    }
    
}

class Rectangle implements Shape {
    double h, w;

    public void setHieghtWidth(Scanner sc) {
        System.out.print("enter a height of rectangle: ");
        this.h = sc.nextDouble();

        System.out.print("enter a width of rectangle: ");
        this.w = sc.nextDouble();
    }

    public void area() {
        double rectangleArea = h*w;
        System.out.println(rectangleArea);
    }

    public void draw() {
        System.out.println("Drawing Rectangle...");
    }
    
}

class Triangle implements Shape {
    double b, h;

    public void setBaseHeight(Scanner sc) {
        System.out.print("enter a base of triangle: ");
        this.b = sc.nextDouble();

        System.out.print("enter a height of triangle: ");
        this.h = sc.nextDouble();
    }

    public void area() {
        double triangleArea = 0.5*b*h;
        System.out.println(triangleArea);
    }

    public void draw() {
        System.out.println("Drawing Triangle...");
    }
    
}


public class ShapeManagement {
    public void shape(Scanner sc) {
        Circle c = new Circle();
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();

        c.setRadius(sc);
        c.area();
        c.draw();

        rec.setHieghtWidth(sc);
        rec.area();
        rec.draw();

        tri.setBaseHeight(sc);
        tri.area();
        tri.draw();
        
    }
    

    
}
