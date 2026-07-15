package klausur_vorbereitung.textVerwürfeln;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eingabe: ");
        String input = scanner.nextLine();

        String[] strArray = input.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            String result = changeAndSort(strArray[i]);
            strArray[i] = result;
        }

        System.out.println();

        String newString = String.join(" ", strArray);
        System.out.println("Ausgabe");
        System.out.println(newString);
    }

    public static String changeAndSort(String str){
        if(str.length() <= 3){
            return str;
        }

        List<SingleChar> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));

        for(int i = 1; i < str.length() - 1; i++){
            SingleChar c = new SingleChar(str.charAt(i));

            list.add(c);
        }

        Collections.sort(list);

        for(SingleChar c : list){
            sb.append(c.getValue());
        }

        sb.append(str.charAt(str.length() - 1));

        return sb.toString();
    }
}
