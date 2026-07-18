package klausur_vorbereitung.textAnalyser;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        System.out.println("Aufgabe 2 von Hamza Mirza, Start:");
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nWie lautet ihre Eingabe?");
            String input = scanner.nextLine();

            String[] strArr = input.split(" ");
            List<WordArray> list = new ArrayList<>();

            for(String s : strArr){
                WordArray match = null;

                for(WordArray w : list){
                    if(s.length() == w.getCharCount()){
                        match = w;
                        break;
                    }
                }

                if(match != null){
                    match.addValue(s);
                }
                else{
                    WordArray newWordArray = new WordArray(s.length());
                    newWordArray.addValue(s);
                    list.add(newWordArray);
                }
            }

            Collections.sort(list);
            System.out.println("\nAusgabe:");
            for(WordArray w : list){
                System.out.println(w.toString());
            }

            System.out.println("\nWollen Sie noch einen Text analysieren (j/n)?");
            String retry = scanner.nextLine();

            if(retry.equals("n")){
                break;
            }

        }
        scanner.close();
        System.out.println("\nAufgabe 2 Ende");
    }
}