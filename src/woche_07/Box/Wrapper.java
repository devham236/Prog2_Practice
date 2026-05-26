package woche_07.Box;

public class Wrapper<T> {
    private T value;

    public Wrapper(){
        this.value = null;
    }

    public Wrapper(T obj){
        this.value = obj;
    }

    public T get(){
        return this.value;
    }

    public void set(T obj){
        this.value = obj;
    }
}