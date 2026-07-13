package klausur_vorbereitung.text_wuerfel;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Satz ein:");
        String input = scanner.nextLine();

        String[] arr = input.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = generate(arr[i]);
        }

        String result = String.join(" ", arr);
        System.out.println("Ausgabe des Ergebnisses:");
        System.out.println(result);
    }

    public static String generate(String input){
        if(input.length() <= 2){
            return input;
        };

        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);

        List<SingleChar> charList = new ArrayList<>();
        for (int i = 1; i < input.length() - 1; i++) {
            charList.add(new SingleChar(input.charAt(i)));
        }

        Collections.sort(charList);

        StringBuilder str = new StringBuilder();
        str.append(firstChar);

        for(SingleChar c : charList){
            str.append(c.getValue());
        }

        str.append(lastChar);

        return str.toString();
    }
}