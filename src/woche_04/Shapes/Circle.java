package woche_04.Shapes;

import java.lang.Math;

public class Circle extends Shape{
    double radius;

    public Circle(double r){
        super("Circle");
        this.radius = r;
    }

    @Override
    public double getArea(){
        return 2 * Math.PI * this.radius;
    }
}
