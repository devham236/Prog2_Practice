package klausur_vorbereitung.wörter_verwürfeln;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aufgabe 1 von Hamza Mirza, Start:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBitte geben Sie einen Satz ein:");
        String input = scanner.nextLine();

        String[] strArr = input.split(" ");
        for(int i = 0; i < strArr.length; i++){
            String str = shuffle(strArr[i]);
            strArr[i] = str;
        }

        System.out.println("\nAusgabe des Ergebnisses: ");
        String result = String.join(" ", strArr);
        System.out.println(result);

        System.out.println("\nAufgabe 1, Ende");
    }

    public static String shuffle(String s){
        if(s.length() <= 3){
            return s;
        }

        StringBuilder sb = new StringBuilder();
        List<SingleChar> list = new ArrayList<>();

        sb.append(s.charAt(0));

        for(int i = 1; i < s.length() - 1; i++){
            SingleChar c = new SingleChar(s.charAt(i));
            list.add(c);
        }

        Collections.sort(list);

        for(SingleChar c : list){
            sb.append(c.getValue());
        }

        sb.append(s.charAt(s.length() - 1));

        return sb.toString();
    }
}
