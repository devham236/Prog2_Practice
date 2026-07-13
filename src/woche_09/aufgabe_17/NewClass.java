package woche_09.aufgabe_17;

import java.util.NoSuchElementException;

public class NewClass implements NewInterface{
    private String[] arr;
    private int pointer = 0;

    public NewClass(String[] a){
        this.arr = (a != null) ? a : new String[0];
    }

    @Override
    public void method(){
        this.pointer = arr.length;
    }

    @Override
    public boolean hasNext() {
        return pointer < arr.length;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Keine weiteren Elemente im Iterator.");
        }
        return arr[pointer++];
    }
}
