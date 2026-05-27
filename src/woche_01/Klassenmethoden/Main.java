package woche_01.Klassenmethoden;

import static woche_01.Klassenmethoden.Boat.intersect;

public class Main {
    public static void main(String[] args) {
        Boat boat1 = new Boat(10.5, 4.75);
        Boat boat2 = new Boat(13.3, 12.67);

        // TODO hier soll die Ausgabe hinzugefügt werden
        System.out.println(boat1.toString());
        System.out.println(intersect(boat1, boat2));
    }
}
