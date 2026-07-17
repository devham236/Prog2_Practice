package klausur_vorbereitung.quersumme;

public class NumberAnalyser {
    public static Integer analyse(Integer i){
        int sum = 0;

        while(i != 0){
            sum = sum + i % 10;
            i = i/10;
        }

        return sum;
    }
}
