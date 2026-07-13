package woche_08.innereKlassen.anonymeInnere;

public class Animal {
    protected String name;

    public Animal(String n){
        this.name = n;
    }

    @Override
    public String toString(){
        return name;
    }
}
