package klausur_vorbereitung;

import java.util.Scanner;
import java.lang.StringBuilder;

public class PasswordGenerator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satz: ");
        String str = scanner.nextLine();

        System.out.println(generatePassword(str));
        scanner.close();
    }

    public static String generatePassword(String input){
        StringBuilder sb = new StringBuilder();

        int count = 0;
        boolean nextCharIsFirst = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(Character.isUpperCase(c)){
                count++;
            }

            if(c != ' ' && nextCharIsFirst){
                sb.append(c);
                nextCharIsFirst = false;
            }

            if(c == ' '){
                nextCharIsFirst = true;
            }
        }

        sb.append(count);
        return sb.toString();
    }
}