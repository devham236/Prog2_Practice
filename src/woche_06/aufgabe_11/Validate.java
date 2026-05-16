package woche_06.aufgabe_11;
import java.lang.Exception;

public class Validate {
    public static void validateInput(String s) throws InvalidException {
        if(s == null || s.length() != 4){
            throw new IllegalArgumentException("Code must be 4 chars long");
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == '0' && s.charAt(i+1) == '0') || (s.charAt(i) == '9' && s.charAt(i+1) == '9')){
                throw new InvalidException("00 or 99 sequence detected");
            }
        }
    }
}
