package woche_07.CompareTo;
import java.util.Arrays;

public class VehicleManagement {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[args.length];
        for (int i = 0; i < args.length; i++) {
            vehicles[i] = new Vehicle(args[i]);
        }

        System.out.println(Arrays.toString(vehicles));

        Arrays.sort(vehicles);

        System.out.println(Arrays.toString(vehicles));
    }
}
