package klausur_vorbereitung.textAnalyse;

import java.util.ArrayList;
import java.util.List;

public class WordArray implements Comparable<WordArray>{
    private Integer charCount;
    private List<String> values;

    public WordArray(Integer c){
        this.charCount = c;
        this.values = new ArrayList<>();
    }

    public int getCharCount(){
        return this.charCount;
    }

    public void addValue(String s){
        this.values.add(s);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(getCharCount());
        sb.append(": ");
        for(String s : values){
            sb.append(String.format("%s ", s));
        }

        return sb.toString();
    }

    public int compareTo(WordArray other){
        return Integer.compare(charCount, other.charCount);
    }
}
