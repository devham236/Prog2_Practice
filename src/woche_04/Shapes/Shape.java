package woche_04.Shapes;

public class Shape {
    String name;

    public Shape(String n){
        this.name = n;
    }

    public double getArea(){
        return 0;
    }

    @Override
    public String toString(){
        return String.format("%s: %f", this.name, getArea());
    }
}
