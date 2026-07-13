package klausur_vorbereitung.rationalFactory;

public class Rational{
    Integer Nominator;
    Integer Denominator;

    public Rational(int n, int d){
        this.Nominator = n;
        this.Denominator = d;
    }

    @Override
    public String toString(){
        return String.format("%d/%d", Nominator, Denominator);
    }
}