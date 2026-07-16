package klausur_vorbereitung.polynom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Funktionswerte schon berechnet werden?");
        int input = scanner.nextInt();

        System.out.println("Evaluate Function f(x) = x*x");
        Polynom p = (double x) -> x*x;
        evalFunctionAndPrint(input, p);

        System.out.println();

        System.out.println("Evaluate Function f(x) = x*x*x + 5*x");
        p = (double x) -> x*x*x + 5*x;
        evalFunctionAndPrint(input, p);

        scanner.close();
    }

    public static void evalFunctionAndPrint(int input, Polynom pol){
        for(int i = 0; i < input; i++){
            double argument = 1.0 + i;
            double result = pol.evaluate(argument);
            System.out.println(String.format("f(%.1f) = %.1f", argument, result));
        }
    }
}
