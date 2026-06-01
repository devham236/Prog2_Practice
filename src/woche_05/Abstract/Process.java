package woche_05.Abstract;

public abstract class Process {
    protected String result;

    abstract void handle(String input);

    public String consume(String input){
        handle(input);
        return this.result;
    }
}
