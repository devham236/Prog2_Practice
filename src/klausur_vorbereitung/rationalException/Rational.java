package klausur_vorbereitung.rationalException;

public class Rational{
    int zaehler;
    int nenner;

    public Rational(int z, int n){
        this.zaehler = z;
        this.nenner = n;
    }

    @Override
    public String toString(){
        return String.format("(%d/%d)", zaehler, nenner);
    }
}