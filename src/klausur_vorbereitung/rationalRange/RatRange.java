package klausur_vorbereitung.rationalRange;

public class RatRange {
    public Rational start;
    public Rational end;

    public RatRange(Rational s, Rational e){
        this.start = s;
        this.end = e;
    }

    public String toString(){
        return String.format("[%s; %s]", start.toString(), end.toString());
    }

    public boolean equals(RatRange other){
        return start.equals(other.start) && end.equals(other.end);
    }
}
