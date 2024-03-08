import java.util.Scanner;

public class Cylinder extends Shape implements Volume {
    double radius, height;

    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the cylinder: ");
        radius = scanner.nextDouble();
        System.out.println("Enter height of the cylinder: ");
        height = scanner.nextDouble();
    }

    public void showShape(String shape) {
        System.out.println("Shape: " + shape);
        System.out.println("Surface Area: " + area());
    }

    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double perimeter() {
        // Perimeter calculation not applicable for cylinder
        return 0;
    }

    public void calculateVolume() {
        System.out.println("Volume: " + volume());
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
