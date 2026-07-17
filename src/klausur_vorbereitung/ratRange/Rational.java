package klausur_vorbereitung.ratRange;

public class Rational {
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

    public boolean equals(Rational other){
        return nominator.equals(other.nominator) && denominator.equals(other.denominator);
    }

    public int hashCode(){
        return nominator + denominator;
    }
}
