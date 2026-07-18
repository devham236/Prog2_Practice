package klausur_vorbereitung.ratRange;


public class Main{
    public static void main(String[] args){
        System.out.println("Aufgabe 2 von Hamza Mirza, Start:");
        Rational rat1 = new Rational(1, 4);
        Rational rat2 = new Rational(1, 3);
        Rational rat3 = new Rational(1, 2);

        RatRange range1 = new RatRange(rat1, rat3);
        RatRange range2 = new RatRange(rat2, rat3);
        RatRange range3 = new RatRange(rat2, rat3);

        System.out.println(String.format("\nRationals: %s %s %s", rat1.toString(), rat2.toString(), rat3.toString()));
        System.out.println(String.format("Mit Hashcode: %d %d %d", rat1.hashcode(), rat2.hashcode(), rat3.hashcode()));

        System.out.println(String.format("\nRatRange 1: %s", range1.toString()));
        System.out.println(String.format("RatRange 2: %s", range2.toString()));
        System.out.println(String.format("RatRange 3: %s", range3.toString()));

        System.out.println(String.format("\n1 equals 2?: %b", range1.equals(range2)));
        System.out.println(String.format("2 equals 3?: %b", range2.equals(range3)));
        System.out.println(String.format("1 equals 3?: %b", range1.equals(range3)));

        System.out.println("\nAufgabe 2 Ende.");
    }
}