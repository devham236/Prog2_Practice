package klausur_vorbereitung.rational;

public class RationalArrayGenerator{
    public Rational[] createRationals(int n){
        Rational[] arr = new Rational[5];

        if(n==0){
            throw new DivisionByZeroException("Division by zero not allowed");
        }

        for (int i = 0; i < 5; i++) {
            Rational rat = new Rational((int)(Math.random() * 11), n);

            arr[i] = rat;
        }

        return arr;
    }
}