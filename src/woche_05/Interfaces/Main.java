package woche_05.Interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = {
                new Square(10),
                new Triangle(10, 10),
                new Circle(10)
        };

        Scanner scanner = new Scanner(System.in);
        double modifier = scanner.nextFloat();
        scanner.close();

        for (Resizeable shape : shapes) {
            System.out.println(shape);
            shape.resize(modifier);
            System.out.println(shape);
        }
    }
}
