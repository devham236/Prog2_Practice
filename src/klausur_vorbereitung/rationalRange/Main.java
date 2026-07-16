package klausur_vorbereitung.rationalRange;

public class Main {
    public static void main(String[] args) {
        Rational rat1 = new Rational(1, 4);
        Rational rat2 = new Rational(1, 3);
        Rational rat3 = new Rational(1, 2);

        System.out.println(String.format("Rationals: %s %s %s", rat1.toString(), rat2.toString(), rat3.toString()));
        System.out.println(String.format("Mit Hashcode: %d %d %d", rat1.HashCode(), rat2.HashCode(), rat3.HashCode()));

        RatRange range1 = new RatRange(new Rational(1, 3), new Rational(1, 2));
        RatRange range2 = new RatRange(new Rational(1, 3), new Rational(1, 2));
        RatRange range3 = new RatRange(new Rational(1, 4), new Rational(1, 2));

        System.out.println(String.format("1 equals 2 ?: %b", range1.equals(range2)));
        System.out.println(String.format("2 equals 3 ?: %b", range2.equals(range3)));
    }
}
