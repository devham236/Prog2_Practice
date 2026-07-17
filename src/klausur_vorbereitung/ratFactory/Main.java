package klausur_vorbereitung.ratFactory;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Aufgabe 1 von Hamza Mirza, Start:");

            System.out.println("\nAufruf mit Rationalfactory(5):");
            Rational[] result = rationalFactory(5);
            for (Rational rat : result){
                System.out.println(rat.toString());
            }

            System.out.println("\nAufruf mit Rationalfactory(0):");
            result = rationalFactory(0);
            for (Rational rat : result){
                System.out.println(rat.toString());
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Rational[] rationalFactory(int num) throws DivisionByZeroException{
        if(num == 0){
            throw new DivisionByZeroException();
        }

        Rational[] ratArr = new Rational[num];
        for(int i = 0; i < num; i++){
            Rational rat = new Rational(i, num);
            ratArr[i] = rat;
        }

        return ratArr;
    }
}
