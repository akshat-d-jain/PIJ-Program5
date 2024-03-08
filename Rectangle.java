import java.util.Scanner;

public class Rectangle extends Shape implements Volume {
    double length, width;

    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.println("Enter width of the rectangle: ");
        width = scanner.nextDouble();
    }

    public void showShape(String shape) {
        System.out.println("Shape: " + shape);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public void calculateVolume() {
        // Volume calculation not applicable for rectangle
        System.out.println("Volume calculation not applicable for rectangle.");
    }
}
