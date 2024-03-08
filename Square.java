import java.util.Scanner;

public class Square extends Shape implements Volume {
    double side;

    public void calculateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side length of the square: ");
        side = scanner.nextDouble();
    }

    public void showShape(String shape) {
        System.out.println("Shape: " + shape);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public void calculateVolume() {
        // Volume calculation not applicable for square
        System.out.println("Volume calculation not applicable for square.");
    }
}
