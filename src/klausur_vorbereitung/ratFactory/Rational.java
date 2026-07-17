package klausur_vorbereitung.ratFactory;

public class Rational{
    private Integer nominator;
    private Integer denominator;

    public Rational(int n, int d){
        this.nominator = n;
        this.denominator = d;
    }

    @Override
    public String toString(){
        return String.format("%d/%d", nominator, denominator);
    }
}