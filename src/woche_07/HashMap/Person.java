package woche_07.HashMap;

public class Person implements Comparable<Person>{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public int compareTo(Person other){
        return name.compareTo(other.toString());
    }
}