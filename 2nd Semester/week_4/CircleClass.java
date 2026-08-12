import java.util.*;

public class CircleClass {
    public void circle(Scanner sc) {
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();

        System.out.print("Enter center of circle (x y): ");
        int cx = sc.nextInt();
        int cy = sc.nextInt();

        System.out.print("Enter point to check (x y): ");
        int px = sc.nextInt();
        int py = sc.nextInt();

        double area = Math.PI*(Math.pow(r, 2));

        double perimeter = 2*Math.PI*r;

        double distance = Math.sqrt(Math.pow((px-cx), 2) + Math.pow((py-cy), 2));

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("distance of point from the centre: " + distance);

        if (distance <= r) {
            System.out.println("Point is inside the circle");
        } else {
            System.out.println("Point is outside the circle");
        }
    }
}
