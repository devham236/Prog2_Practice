package klausur_vorbereitung.smurfs;

public class Smurf implements TwoLegged{
    private String name;

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String str){
        this.name = str;
    }

    @Override
    public String toString(){
        return getName();
    }
}
