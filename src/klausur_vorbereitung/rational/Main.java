package klausur_vorbereitung.rational;

public class Main {
    public static void main(String[] args) {
        try {
            RationalArrayGenerator arrGen = new RationalArrayGenerator();
            Rational[] arr = arrGen.generateArray(2);

            for(Rational rat : arr){
                System.out.println(rat);
            }

        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
    }
}
