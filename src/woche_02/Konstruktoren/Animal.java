package woche_02.Konstruktoren;

public class Animal {
    String name;
    int legs;

    public Animal(String n, int l){
        this.name = n;
        this.legs = l;
    }

    public Animal(String n){
        this.name = n;
        this.legs = 4;
    }

    public Animal(int l){
        this.name = "Bob";
        this.legs = l;
    }

    public Animal(Animal animal){
        this.name = animal.getName();
        this.legs = animal.getLegs();
    }

    public Animal(){
        this.name = "Bob";
        this.legs = 4;
    }

    public String getName(){
        return this.name;
    }

    public int getLegs(){
        return this.legs;
    }
}
