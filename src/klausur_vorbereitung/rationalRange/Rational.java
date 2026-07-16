package klausur_vorbereitung.rationalRange;

public class Rational {
    private Integer nominator;
    private Integer denominator;

    public Rational(Integer n, Integer d){
        this.nominator = n;
        this.denominator = d;
    }

    public boolean equals(Rational other){
        return nominator.equals(other.nominator) && denominator.equals(other.denominator);
    }

    public int HashCode(){
        return nominator + denominator;
    }

    @Override
    public String toString(){
        return String.format("%d/%d", this.nominator, this.denominator);
    }
}
