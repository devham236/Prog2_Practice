package klausur_vorbereitung.textAnalyser;

import java.util.Vector;

public class WordArray implements Comparable<WordArray>{
    public Vector<String> values;
    Integer charCount;

    public WordArray(Integer c){
        this.charCount = c;
        this.values = new Vector<>();
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
        sb.append(String.format("%d: ", this.charCount));

        for(String v : values){
            sb.append(String.format("%s ", v));
        }

        return sb.toString();
    }

    public int compareTo(WordArray other){
        return Integer.compare(this.charCount, other.charCount);
    }
}
