package woche_06.InstanceOf;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i % 3 == 0) consumer(new Vehicle(args[i]));
            if (i % 3 == 1) consumer(new Truck(args[i]));
            if (i % 3 == 2) consumer(new Cube());
        }
    }

    public static void consumer(Object o) {
        //TODO
        if(o instanceof Moveable){
            Moveable obj = (Moveable) o;
            System.out.println(obj.move());
        }
        if (o instanceof Vehicle) {
            Vehicle obj = (Vehicle) o;
            System.out.println(obj.getColor());
        }
        if(o instanceof Truck){
            Truck obj = (Truck) o;
            System.out.println(obj.getLoad());
        }
    }
}