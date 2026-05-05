package woche_04;

public class Main {
    public static void main(String[] args) {
        Packet p1 = new Packet(100);
        System.out.println("Dauer DataPackage (Größe 100): " + p1.calcTransmissionDuration());

        TCP tcp1 = new TCP(100, "TCP-01");
        System.out.println("ID: " + tcp1.getId());
        System.out.println("Dauer TCP (Größe 100): " + tcp1.calcTransmissionDuration());
    }
}
