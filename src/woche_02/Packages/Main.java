package woche_02.Packages;

import woche_02.Packages.vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car('g');

        System.out.println(car.getColor());
    }
}
