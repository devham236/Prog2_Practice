package klausur_vorbereitung;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Cypher {
    public static void main(String[] args) {
        // a-z = 97 bis 122
        //A-Z = 65 bis 90
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        System.out.print("Zu entschlüsseln: ");
        String input = scanner.nextLine();
        str.append(input);

        System.out.print("Schlüssel: ");
        int key = scanner.nextInt();


        for(int i = 0; i < str.length(); i++){
            int newChar = str.charAt(i) - key;
            System.out.printf("current char: %c new char: %c\n", str.charAt(i), (char) newChar);

            if(newChar < 97 && newChar > 90){
                int rest = 97 - newChar;
                str.setCharAt(i, (char) (122 - (rest - 1)));
            }
            else if(newChar < 65){
                int rest = 65 - newChar;
                str.setCharAt(i, (char) (90 - (rest - 1)));
            }
            else{
                str.setCharAt(i, (char) newChar);
            }
        }

        System.out.println(str);
    }
}
