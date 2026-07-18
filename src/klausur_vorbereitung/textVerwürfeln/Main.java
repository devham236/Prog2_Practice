package klausur_vorbereitung.textVerwürfeln;

import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        System.out.println("Aufgabe 1 von Hamza Mirza, Start:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBitte geben Sie einen Satz ein:");
        String input = scanner.nextLine();

        String[] strArr = input.split(" ");

        for(int i = 0; i < strArr.length; i++){
            strArr[i] = shuffle(strArr[i]);
        }

        System.out.println("\nAusgabe des Ergebnisses:");
        String result = String.join(" ", strArr);
        System.out.println(result);

        scanner.close();
        System.out.println("\nAufgabe 1, Ende.");
    }

    public static String shuffle(String str){
        if(str.length() <= 3){
            return str;
        }

        StringBuilder sb = new StringBuilder();
        List<SingleChar> list = new ArrayList<>();

        sb.append(str.charAt(0));

        for(int i = 1; i < str.length() - 1; i++){
            SingleChar newChar = new SingleChar(str.charAt(i));
            list.add(newChar);
        }

        Collections.sort(list);

        for(SingleChar c : list){
            sb.append(c.getChar());
        }

        sb.append(str.charAt(str.length() - 1));

        return sb.toString();
    }
}