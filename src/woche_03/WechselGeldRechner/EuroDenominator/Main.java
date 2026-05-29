package woche_03.WechselGeldRechner.EuroDenominator;

public class Main {
    public static void main(String[] args) {
        for (EuroDenomination euro : EuroDenomination.values()) {
            System.out.println(euro.centValue());
            System.out.println(euro.representation());
        }
    }
}
