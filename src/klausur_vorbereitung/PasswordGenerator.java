package klausur_vorbereitung;

import java.lang.StringBuilder;

public class PasswordGenerator{
    public static void main(String[] args){
        String input = "Hallo mein Name ist Hamza";
        StringBuilder str = new StringBuilder();
        int count = 0;
        boolean nextCharIsFirst = true;

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);

            if(Character.isUpperCase(c)){
                count++;
            }

            if(c != ' ' && nextCharIsFirst){
                str.append(c);
                nextCharIsFirst = false;
            }

            if(c == ' '){
                nextCharIsFirst = true;
            }
        }

        str.append(count);

        System.out.println(str.toString());
    }
}