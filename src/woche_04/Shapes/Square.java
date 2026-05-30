package woche_04.Shapes;

import java.lang.Math;

public class Square extends Shape{
    double length;

    public Square(double l){
        super("Square");
        this.length = l;
    }

    @Override
    public double getArea(){
        return Math.pow(this.length, 2);
    }
}
