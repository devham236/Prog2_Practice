package klausur_vorbereitung.name;

public class KlasseA implements Nameable{
    public String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String n){
        this.name = n;
    }

    @Override
    public String toString(){
        return getName();
    }
}