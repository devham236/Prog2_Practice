package woche_05.Interfaces;

public class Square implements Resizeable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public String toString() {
        return String.format("Square: %f", getArea());
    }

    @Override
    public void resize(double value){
        side *= value;
    }
}
