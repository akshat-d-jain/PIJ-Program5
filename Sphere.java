import java.util.Scanner;

public class Sphere extends Shape implements Volume {
    double radius;

    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the sphere: ");
        radius = scanner.nextDouble();
    }

    public void showShape(String shape) {
        System.out.println("Shape: " + shape);
        System.out.println("Surface Area: " + area());
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public double perimeter() {
        // Perimeter calculation not applicable for sphere
        return 0;
    }

    public void calculateVolume() {
        System.out.println("Volume: " + volume());
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
