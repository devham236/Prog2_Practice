package woche_02.Bruchzahlen.task1.model;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int num, int denom){
        this.numerator = num;
        this.denominator = denom;
    }

    public String toString(){
        return String.format("(%d/%d)", numerator, denominator);
    }

    public void reduce() {
        // counts backwards from the lower number (numerator or denominator) to 1 and tests if both numbers a divisble by i
        int lower = numerator;
        if (lower > denominator) {
            lower = denominator;
        }
        for (int i = lower;i > 1;i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
                break;
            }
        }
    }

    public static Fraction multiply(Fraction multiplicandA, Fraction multiplicandB){
        int zaehler = multiplicandA.numerator * multiplicandB.numerator;
        int nenner = multiplicandA.denominator * multiplicandB.denominator;

        Fraction fraction = new Fraction(zaehler, nenner);
        fraction.reduce();

        return fraction;
    }

    //TODO fügen Sie hier die Methode ein
}
