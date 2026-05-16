package klausur_vorbereitung.box;

public class Box implements Comparable<Box>{
    String content;
    Integer weight;

    public Box(String c, int w){
        this.content = c;
        this.weight = w;
    }

    @Override
    public int compareTo(Box otherBox){
        return Integer.compare(this.weight, otherBox.weight);
    }

    @Override
    public String toString(){
        return "Box mit Content Type %s wiegt %d kg".formatted(this.content, this.weight);
    }
}