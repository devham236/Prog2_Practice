package klausur_vorbereitung.ratRange;

public class RatRange {
    private Rational start;
    private Rational end;

    public RatRange(Rational s, Rational e){
        this.start = s;
        this.end = e;
    }

    public String toString(){
        return String.format("[%s; %s]", start.toString(), end.toString());
    }

    public boolean equals(RatRange other){
        return start.equals(other.start) && end.equals((other.end));
    }
}
