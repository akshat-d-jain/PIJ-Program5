import java.util.Scanner;

public class Circle extends Shape implements Volume {
    double radius;

    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        radius = scanner.nextDouble();
    }

    public void showShape(String shape) {
        System.out.println("Shape: " + shape);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void calculateVolume() {
        // Volume calculation not applicable for circle
        System.out.println("Volume calculation not applicable for circle.");
    }
}
