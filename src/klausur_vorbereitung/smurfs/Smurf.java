package klausur_vorbereitung.smurfs;

public class Smurf implements TwoLegged{
    private String name;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String n) {
        this.name = n;
    }

    @Override
    public String toString(){
        return getName();
    }
}
