package klausur_vorbereitung.text_wuerfel;

public class SingleChar implements Comparable<SingleChar>{
    char value;

    public SingleChar(char c){
        this.value = c;
    }

    public char getValue(){
        return this.value;
    }

    @Override
    public int compareTo(SingleChar other){
        return Character.compare(this.value, other.value);
    }
}
