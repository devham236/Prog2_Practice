package klausur_vorbereitung.rational;

public class Main{
    public static void main(String[] args){
       try{
           RationalArrayGenerator arr = new RationalArrayGenerator();
           Rational[] ratArr = arr.createRationals(0);
           for (int i = 0; i < ratArr.length; i++) {
               System.out.printf("Zähler: %d, Nenner: %d \n", ratArr[i].zaehler, ratArr[i].nenner);
           }
       } catch (DivisionByZeroException e) {
           System.out.println(e.getMessage());
       }
    }
}