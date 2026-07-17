package klausur_vorbereitung.textAnalyser;

import java.util.ArrayList;
import java.util.List;

public class WordArray implements Comparable<WordArray>{
    private List<String> values;
    private Integer charCount;

    public WordArray(int c){
        this.charCount = c;
        this.values = new ArrayList<>();
    }

    public int getCount(){
        return this.charCount;
    }

    public void addValue(String v){
        this.values.add(v);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(this.charCount);
        sb.append(": ");
        sb.append(String.join(" ", values));

        return sb.toString();
    }

    @Override
    public int compareTo(WordArray other){
        return Integer.compare(charCount, other.charCount);
    }
}