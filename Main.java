import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    Circle circle = new Circle();
                    circle.calculateShape();
                    circle.showShape("Circle");
                    circle.calculateVolume();
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle();
                    rectangle.calculateShape();
                    rectangle.showShape("Rectangle");
                    rectangle.calculateVolume();
                    break;
                case 3:
                    Square square = new Square();
                    square.calculateShape();
                    square.showShape("Square");
                    square.calculateVolume();
                    break;
                case 4:
                    Sphere sphere = new Sphere();
                    sphere.calculateShape();
                    sphere.showShape("Sphere");
                    sphere.calculateVolume();
                    break;
                case 5:
                    Cylinder cylinder = new Cylinder();
                    cylinder.calculateShape();
                    cylinder.showShape("Cylinder");
                    cylinder.calculateVolume();
                    break;
                case 6:
                    Pyramid pyramid = new Pyramid();
                    pyramid.calculateShape();
                    pyramid.showShape("Pyramid");
                    pyramid.calculateVolume();
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
                    break;
            }
        } while (choice != 7);

        scanner.close();
    }
}
