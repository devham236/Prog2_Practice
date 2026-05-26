package klausur_vorbereitung;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Cypher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("Zu entschlüsseln: ");
        String input = scanner.next();
        sb.append(input);

        System.out.print("Schlüssel: ");
        int key = scanner.nextInt();

        for(int i = 0; i < sb.length(); i++){
            int newChar = sb.charAt(i) - key;

            if(newChar < 97 && newChar > 65){
                int rest = 97 - newChar;
                sb.setCharAt(i, (char) (122 - (rest - 1)));
            }
            else if(newChar < 65){
                int rest = 65 - newChar;
                sb.setCharAt(i, (char) (90 - (rest - 1)));
            }
            else{
                sb.setCharAt(i, (char) newChar);
            }
        }

        System.out.println(sb);

    }
}
