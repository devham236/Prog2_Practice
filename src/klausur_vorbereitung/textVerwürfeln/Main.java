package klausur_vorbereitung.textVerwürfeln;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eingabe:");
        String input = scanner.nextLine();

        String[] strArr = input.split("(?<=\\b)|(?=\\b)");

        for(int i = 0; i < strArr.length; i++){
            String result = shuffle(strArr[i]);
            strArr[i] = result;
        }

        System.out.println("\nAusgabe:");
        String result = String.join("", strArr);
        System.out.println(result);
    }

    public static String shuffle(String str){
        if(str.length() <= 3){
            return str;
        }

        StringBuilder sb = new StringBuilder();
        List<SingleChar> list = new ArrayList<>();

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
