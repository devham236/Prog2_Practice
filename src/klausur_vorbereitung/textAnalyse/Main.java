package klausur_vorbereitung.textAnalyse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Eingabe:");
            String input = scanner.nextLine();

            String[] strArr = input.split(" ");
            List<WordArray> list = new ArrayList<>();

            for(String s : strArr){
                WordArray match = null;

                for(WordArray w : list){
                    if(w.getCharCount() == s.length()){
                        match = w;
                        break;
                    }
                }

                if(match != null){
                    match.addValue(s);
                }
                else {
                    WordArray newWordArr = new WordArray(s.length());
                    newWordArr.addValue(s);
                    list.add(newWordArr);
                }
            }

            Collections.sort(list);

            System.out.println("\nAusgabe");
            for (WordArray w : list){
                System.out.println(w.toString());
            }

            System.out.println("Nochmal? (j/n)");
            String retry = scanner.nextLine();

            if(retry.equals("n")){
                break;
            }
        }

        scanner.close();
    }
}
