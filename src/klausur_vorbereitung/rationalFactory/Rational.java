package klausur_vorbereitung.rationalFactory;

public class Rational {
    public Integer nominator;
    public Integer denominator;

    public Rational(int n, int d){
        this.nominator = n;
        this.denominator = d;
    }

    @Override
    public String toString(){
        return String.format("%d/%d", nominator, denominator);
    }
}
