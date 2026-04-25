package woche_02.vbp_02;

public class Book {
    public String name;
    public int published;

    public Book(String n, int p){
        this.name = n;
        this.published = p;
    }

    public String toString(){
        return this.name;
    }

}
