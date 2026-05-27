 package klausur_vorbereitung.box;

public class Box implements Comparable<Box>{
    String name;
    Integer weight;

    public Box(String n, int w){
        this.name = n;
        this.weight = w;
    }

    @Override
    public int compareTo(Box other){
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public String toString(){
        return "Box %s, weighs %d kg.".formatted(this.name, this.weight);
    }
}