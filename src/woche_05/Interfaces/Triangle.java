package woche_05.Interfaces;

public class Triangle implements Resizeable {
    private double adjacent;
    private double opposite;

    public Triangle(double adjacent, double opposite) {
        this.adjacent = adjacent;
        this.opposite = opposite;
    }

    public double getArea() {
        return adjacent * opposite / 2;
    }

    public String toString() {
        return String.format("Triangle: %f", getArea());
    }

    @Override
    public void resize(double value){
        adjacent *= value;
        opposite *= value;
    }
}
