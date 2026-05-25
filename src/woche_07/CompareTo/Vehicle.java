package woche_07.CompareTo;

public class Vehicle implements Comparable<Vehicle>{
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    //TODO
    @Override
    public int compareTo(Vehicle v) {
        return this.name.compareTo(v.name);
    }
}
