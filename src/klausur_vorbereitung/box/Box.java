package klausur_vorbereitung.box;

public class Box implements Comparable<Box>{
    String content;
    int weight;

    public Box(String s, int w){
        this.content = s;
        this.weight = w;
    }

    @Override
    public String toString(){
        return String.format("Box mit content %s und Gewicht %dkg", content, weight);
    }

    @Override
    public int compareTo(Box other){
        return Integer.compare(this.weight, other.weight);
    }
}
