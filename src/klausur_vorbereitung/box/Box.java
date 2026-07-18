package klausur_vorbereitung.box;

public class Box implements Comparable<Box>{
    String content;
    Integer weight;

    public Box(String c, Integer w){
        this.content = c;
        this.weight = w;
    }

    @Override
    public String toString(){
        return String.format("Box mit Content Type %s wiegt %dkg.", content, weight);
    }

    @Override
    public int compareTo(Box other){
        return Integer.compare(weight, other.weight);
    }
}