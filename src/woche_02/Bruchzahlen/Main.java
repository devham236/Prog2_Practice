package woche_02.Bruchzahlen;

import woche_02.Bruchzahlen.task1.FractionManager;
import woche_02.Bruchzahlen.task1.model.Fraction;

public class Main {
    public static void main(String[] args) {
        if (args.length >= 1) {
            try {
                for (int i = 1; i < args.length; i+=2) {
                    Fraction fraction = new Fraction(
                            Integer.parseInt(args[i - 1]),
                            Integer.parseInt(args[i])
                    );
                    System.out.println(fraction);
                }
            } catch (NumberFormatException e) {
                System.out.println("Parsing Error");
            }
            return;
        }

        FractionManager.output();
    }
}
