package klausur_vorbereitung.hashCode;

public class Rational {
    Integer nominator;
    Integer denominator;

    public Rational(int n, int d){
        this.nominator = n;
        this.denominator = d;
    }

    public String toString(){
        return String.format("%d/%d", nominator, denominator);
    }

    @Override
    public int hashCode(){
        return nominator + denominator;
    }

    public boolean equals(Object obj){
        Rational other = (Rational) obj;
        return nominator.equals(other.nominator) && denominator.equals(other.denominator);
    }
}
