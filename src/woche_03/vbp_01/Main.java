package woche_03.vbp_01;

public class Main {
    public static void main(String[] args) {
        Transportation transp = Transportation.PRIORITY;

        double basePrice = 20.0;
        double cost = transp.calculateCost(basePrice);
        int days = transp.getShippingTime();
        boolean tooHeavy = transp.checkWeight(300.0);

        System.out.println("Typ: " + transp);
        System.out.println("Basis: " + basePrice);
        System.out.println("Gesamtkosten: " + cost);
        System.out.println("Lieferdauer: " + days + " Tage");
        System.out.println("Gewicht überschritten: " + tooHeavy);
    }
}
