package klausur_vorbereitung.textVerwürfeln;

public class SingleChar implements Comparable<SingleChar>{
    private char value;

    public SingleChar(char c){
        this.value = c;
    }

    public char getChar(){
        return this.value;
    }

    @Override
    public int compareTo(SingleChar other){
        return Character.compare(value, other.value);
    }
}