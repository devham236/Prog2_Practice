package klausur_vorbereitung;

public class PasswordGenerator {
    public static void main(String[] args) {
        String test = "hallo ich bin  Hamza";

        System.out.println(generatePassword(test));
    }

    public static String generatePassword(String str){
        String password = "";
        int count = 0;
        boolean nextCharIsFirstLetter = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)){
                count++;
            }

            if(c != ' ' && nextCharIsFirstLetter){
                password += c;
                nextCharIsFirstLetter = false;
            }
            else if(c == ' '){
                nextCharIsFirstLetter = true;
            }
        }

        password += Integer.toString(count);
        return password;
    }

}
