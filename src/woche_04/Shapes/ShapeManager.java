package woche_04.Shapes;

import java.util.Scanner;

public class ShapeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = switch (scanner.next()) {
            case "Circle" -> new Circle(scanner.nextDouble());
            case "Square" -> new Square(scanner.nextDouble());
            default -> new Shape("Nothing");
        };
        System.out.println(shape);
        scanner.close();
    }
}
