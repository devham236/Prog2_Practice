package klausur_vorbereitung.rationalFactory;

public class Main{
    public static void main(String[] args) {
        try{
            Rational[] arr1 = rationalFactory(5);
            System.out.println("Aufruf mit rationalArrayFactory(5):");
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i]);
            }

            System.out.println();

            System.out.println("Aufruf mit rationalArrayFactory(0):");
            Rational[] arr2 = rationalFactory(0);

        }
        catch (DivisionByZero e){
            e.printStackTrace();
        }
    }

    public static Rational[] rationalFactory(int n) throws DivisionByZero{
        Rational[] arr = new Rational[5];

        if(n == 0){
            throw new DivisionByZero();
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Rational(i, n);
            }
        }

        return arr;
    }
}