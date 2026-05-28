package woche_02.Bruchzahlen.task1;

import woche_02.Bruchzahlen.task1.model.Fraction;

import java.util.Random;

public class FractionManager {
    //TODO
    public static Fraction[] fractions = new Fraction[4];

    public static void output() {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(12, 13);
//        System.out.println(f1.toString());
//        System.out.println(f2.toString());

        //TODO
        Random random = new Random();
        fractions[0] = new Fraction(random.nextInt(10), random.nextInt(10));;
        fractions[1] = new Fraction(random.nextInt(10), random.nextInt(10));;
        fractions[2] = new Fraction(random.nextInt(10), random.nextInt(10));
        fractions[3] = new Fraction(random.nextInt(10), random.nextInt(10));

        Fraction result1 = Fraction.multiply(fractions[0], fractions[1]);
        Fraction result2 = Fraction.multiply(fractions[2], fractions[3]);

        Fraction result3 = Fraction.multiply(result1, result2);
        System.out.println(result3.toString());
    }
}
