package klausur_vorbereitung.rational;

import java.util.Random;

public class RationalArrayGenerator{
    public Rational[] generateArray(int n) throws DivisionByZeroException{
        Rational[] arr = new Rational[5];
        Random random = new Random();

        if(n == 0){
            throw new DivisionByZeroException("Division by Zero");
        }
        else{
            for(int i = 0; i < arr.length; i++){
                arr[i] = new Rational(random.nextInt(20), n);
            }
        }

        return arr;
    }
}