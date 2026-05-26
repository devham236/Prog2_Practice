package klausur_vorbereitung;
import java.lang.StringBuilder;

public class PasswordGenerator {
    public static void main(String[] args) {
        String test = "Hallo ich bin Hamza"; //IbEs2

        System.out.println(generatePassword(test));
    }

    public static String generatePassword(String str){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        boolean nextCharIsFirstLetter = true;

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(Character.isUpperCase(c)){
                count++;
            }

            if(c != ' ' && nextCharIsFirstLetter){
                nextCharIsFirstLetter = false;
                sb.append(str.charAt(i));
            }

            if(c == ' '){
                nextCharIsFirstLetter = true;
            }
        }
        sb.append(count);
        return sb.toString();
    }

}
