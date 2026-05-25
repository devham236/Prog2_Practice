package klausur_vorbereitung;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Cypher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int key;

        System.out.print("Zu entschlüsseln: ");
        String s = scanner.next();
        sb.append(s);

        System.out.print("Schlüssel: ");
        key = scanner.nextInt();

        for(int i = 0; i < sb.length(); i++){
            int newChar = sb.charAt(i) - key;
            if(newChar < 97){
                int rest = 97 - newChar;
                sb.setCharAt(i, (char) (122 - (rest - 1)));
            }
            else{
                sb.setCharAt(i, (char) newChar);
            }
        }

        System.out.println(sb);

    }
}
