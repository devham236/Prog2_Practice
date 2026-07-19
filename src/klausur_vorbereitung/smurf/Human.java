package klausur_vorbereitung.smurf;

public class Human implements TwoLegged{
    private String name;

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return getName();
    }
}
