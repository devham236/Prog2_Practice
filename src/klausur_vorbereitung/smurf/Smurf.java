package klausur_vorbereitung.smurf;

public class Smurf implements TwoLegged{
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
