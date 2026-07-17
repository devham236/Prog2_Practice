package klausur_vorbereitung.polynom;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Aufgabe 2 von Hamza Mirza, Start:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWie viele Funktionswerte sollen berechnet werden?");
        int input = scanner.nextInt();

        System.out.println("\nEvaluate Function f(x) = x*x");
        Polynom p = (double x) -> x*x;
        eval(p, input);

        System.out.println("\nEvaluate Function f(x) = x*x*x + 5*x");
        p = (double x) -> x*x*x + 5*x;
        eval(p, input);
    }

    public static void eval(Polynom p, int count){
        for(int i = 0; i < count; i++){
            double argument = 1.0 + i;
            double result = p.evaluate(argument);
            System.out.println(String.format("f(%.1f) = %.1f", argument, result));
        }
    }

}