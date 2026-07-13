package woche_08.aufgabe_16;

public class Main {
    public static void main(String[] args) {
        BigNum num1 = new BigNum("10012002");
        BigNum num2 = new BigNum("12345"); // Sollte zu 00012345 werden
        BigNum num3 = new BigNum("10012003");

        // 1. Test toString() und getBlocksAmount()
        System.out.println("Zahl 1: " + num1 + " (Blöcke: " + num1.getBlocksAmount() + ")");
        // Ausgabe: 10012002 (Blöcke: 2)

        System.out.println("Zahl 2: " + num2 + " (Blöcke: " + num2.getBlocksAmount() + ")");
        // Ausgabe: 00012345 (Blöcke: 2)

        // 2. Test der Vergleichsmethode (isLessThan)
        System.out.println("Ist Zahl 2 kleiner als Zahl 1? " + num2.isLessThan(num1));
        // Ausgabe: true (weil 0001... kleiner ist als 1001...)

        System.out.println("Ist Zahl 1 kleiner als Zahl 3? " + num1.isLessThan(num3));
        // Ausgabe: true (weil am Ende 2002 kleiner als 2003 ist)

        System.out.println("Ist Zahl 1 kleiner als Zahl 2? " + num1.isLessThan(num2));
        // Ausgabe: false
    }
}
