package klausur_vorbereitung.textVerwürfeln;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eingabe:");
        String input = scanner.nextLine();

        String[] strArray = input.split(" ");

        for (int i = 0; i < strArray.length; i++){
            String result = generate(strArray[i]);
            strArray[i] = result;
        }

        String newString = String.join(" ", strArray);

        System.out.println("Ausgabe:");
        System.out.println(newString);
    }

    public static String generate(String word){
        if(word.length() <= 3){
            return word;
        }

        StringBuilder sb = new StringBuilder();
        List<SingleChar> list = new ArrayList<>();

        sb.append(word.charAt(0));

        for(int i = 1; i < word.length() - 1; i++){
            SingleChar c = new SingleChar(word.charAt(i));
            list.add(c);
        }

        Collections.sort(list);

        for(SingleChar c : list){
            sb.append(c.getValue());
        }

        sb.append(word.charAt(word.length() - 1));

        return sb.toString();
    }
}
