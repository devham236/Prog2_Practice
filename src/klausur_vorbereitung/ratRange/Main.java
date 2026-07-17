package klausur_vorbereitung.ratRange;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aufgabe 2 von Hamza Mirza");
        Rational rat1 = new Rational(1, 4);
        Rational rat2 = new Rational(1, 3);
        Rational rat3 = new Rational(1, 2);

        RatRange r1 = new RatRange(rat1, rat2);
        RatRange r2 = new RatRange(rat2, rat3);
        RatRange r3 = new RatRange(rat2, rat3);

        System.out.println(String.format("Rationals: %s %s %s", rat1, rat2, rat3));
        System.out.println(String.format("mit Hashcode: %d %d %d", rat1.hashCode(), rat2.hashCode(), rat3.hashCode()));

        System.out.println(String.format("\nRatRange 1: %s", r1));
        System.out.println(String.format("RatRange 2: %s", r2));
        System.out.println(String.format("RatRange 3: %s", r3));

        System.out.println(String.format("\n1 equals 2?: %b", r1.equals(r2)));
        System.out.println(String.format("\n2 equals 3?: %b", r2.equals(r3)));

        System.out.println("\nAufgabe 2 Ende");
    }
}
