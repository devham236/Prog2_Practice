package klausur_vorbereitung.rationalRange;

public class Main {
    public static void main(String[] args) {
        Rational rat1 = new Rational(1, 4);
        Rational rat2 = new Rational(1, 3);
        Rational rat3 = new Rational(1, 2);

        RatRange range1 = new RatRange(rat1, rat3);
        RatRange range2 = new RatRange(rat2, rat3);
        RatRange range3 = new RatRange(rat2, rat3);

        System.out.print(rat1.toString());
        System.out.print(" ");
        System.out.print(rat2.toString());
        System.out.print(" ");
        System.out.print(rat3.toString());
        System.out.println();

        System.out.printf("Hashcodes: %d %d %d\n", rat1.hashCode(), rat2.hashCode(), rat3.hashCode());

        System.out.printf("RatRange 1: [%s; %s]\n", range1.getStart(), range1.getEnd());
        System.out.printf("RatRange 2: [%s; %s]\n", range2.getStart(), range2.getEnd());
        System.out.printf("RatRange 3: [%s; %s]\n", range3.getStart(), range3.getEnd());

        System.out.printf("1 equals 2 ?: %b\n", range1.equals(range2));
        System.out.printf("2 equals 3 ?: %b\n", range2.equals(range3));
    }
}
