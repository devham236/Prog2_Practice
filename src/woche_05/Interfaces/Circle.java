package woche_05.Interfaces;

public class Circle implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return String.format("Circle: %f", getArea());
    }

    @Override
    public void resize(double value){
        radius *= value;
    }
}
