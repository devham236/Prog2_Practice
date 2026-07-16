package klausur_vorbereitung.rationalFactory;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Aufruf mit RationalFactory(5):");
            Rational[] ratArr = rationalFactory(0);

            for(Rational rat : ratArr){
                System.out.println(rat.toString());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Rational[] rationalFactory(Integer n) throws DivisionByZero{
        if(n == 0){
            throw new DivisionByZero();
        }
        else{
            Rational[] arr = new Rational[n];

            for (int i = 0, j = 1; i < n; i++) {
                Rational rat = new Rational(j, n);
                j++;
                arr[i] = rat;
            }

            return arr;
        }
    }
}
