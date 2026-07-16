package klausur_vorbereitung.rationalRange;

import java.util.Objects;

public class RatRange {
    Rational start;
    Rational end;

    public RatRange(Rational s, Rational e){
        this.start = s;
        this.end = e;
    }

    public Rational getStart(){
        return start;
    }

    public Rational getEnd(){
        return end;
    }

    @Override
    public boolean equals(Object obj){
        RatRange other = (RatRange) obj;
        return Objects.equals(start, other.start) && Objects.equals(end, other.end);
    }
}
