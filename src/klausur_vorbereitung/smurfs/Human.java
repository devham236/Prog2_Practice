package klausur_vorbereitung.smurfs;

public class Human implements TwoLegged{
    String name;

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String s){
        this.name = s;
    }

    @Override
    public String toString(){
        return getName();
    }
}