package woche_01.Klassenmethoden;

public class Boat {
    private double x;
    private double y;

    // TODO fügen Sie hier den geforderten Konstruktor ein
    public Boat(double xCoord, double yCoord){
        this.x = xCoord;
        this.y = yCoord;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("Boat position: (%f,%f)", x, y);
    }

    public static boolean intersect(Boat boat1, Boat boat2) {
        return boat1.getX() == boat2.getX() && boat1.getY() == boat2.getY();
    }
}
