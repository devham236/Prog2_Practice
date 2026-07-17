package klausur_vorbereitung.wörter_verwürfeln;

public class SingleChar implements Comparable<SingleChar>{
    private char value;

    public SingleChar(char c){
        this.value = c;
    }

    public char getValue(){
        return this.value;
    }

    @Override
    public int compareTo(SingleChar other){
        return Character.compare(value, other.value);
    }
}
