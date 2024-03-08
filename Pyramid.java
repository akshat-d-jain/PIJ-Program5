import java.util.Scanner;

public class Pyramid extends Shape implements Volume {
    double baseLength, baseWidth, height;

    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the base of the pyramid: ");
        baseLength = scanner.nextDouble();
        System.out.println("Enter width of the base of the pyramid: ");
        baseWidth = scanner.nextDouble();
        System.out.println("Enter height of the pyramid: ");
        height = scanner.nextDouble();
    }

    public void showShape(String shape) {
        System.out.println("Shape: " + shape);
        System.out.println("Surface Area: " + area());
    }

    public double area() {
        double baseArea = baseLength * baseWidth;
        double sideArea = baseLength * Math.sqrt(Math.pow(baseWidth / 2, 2) + Math.pow(height, 2));
        double totalArea = 4 * (0.5 * baseWidth * height) + baseArea;
        return totalArea;
    }

    public double perimeter() {
        // Perimeter calculation not applicable for pyramid
        return 0;
    }

    public void calculateVolume() {
        System.out.println("Volume: " + volume());
    }

    public double volume() {
        return (1.0 / 3.0) * baseLength * baseWidth * height;
    }
}
