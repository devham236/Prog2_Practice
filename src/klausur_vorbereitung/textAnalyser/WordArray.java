package klausur_vorbereitung.textAnalyser;

import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class WordArray implements Comparable<WordArray>{
    private List<String> values;
    private Integer charCount;

    public WordArray(Integer c){
        this.charCount = c;
        this.values = new ArrayList<>();
    }

    public void addValue(String s){
        values.add(s);
    }

    public int getCharCount(){
        return this.charCount;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(charCount);
        sb.append(": ");

        for(String s : values){
            sb.append(String.format("%s ", s));
        }

        return sb.toString();
    }

    @Override
    public int compareTo(WordArray other){
        return Integer.compare(charCount, other.charCount);
    }
}