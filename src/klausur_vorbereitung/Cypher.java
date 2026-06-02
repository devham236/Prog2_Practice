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
        key = key % 26;


        for(int i = 0; i < str.length(); i++){
            int newChar = str.charAt(i) - key;
            char curr = str.charAt(i);

            if(curr >= 97 && curr <= 122){
                if(newChar < 97){
                    int rest = 97 - newChar;
                    str.setCharAt(i, (char) (122 - (rest - 1)));
                }
                else{
                    str.setCharAt(i, (char) newChar);
                }
            }
            else if(curr >= 60 && curr <= 90){
                if (newChar < 65) {
                    int rest = 65 - newChar;
                    str.setCharAt(i, (char) (90 - (rest - 1)));
                } else {
                    str.setCharAt(i, (char) newChar);
                }
            }
            else{
                str.setCharAt(i, curr);
            }
        }

        System.out.println(str);
    }
}
