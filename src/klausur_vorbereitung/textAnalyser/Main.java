package klausur_vorbereitung.textAnalyser;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<WordArray> list = new ArrayList<>();

        System.out.print("Eingabe: ");
        String input = scanner.nextLine();

        String[] arr = input.split(" ");

        for (String s : arr){
            Optional<WordArray> result = list.stream().filter(w -> w.charCount == s.length()).findFirst();

            if(result.isPresent()){
                WordArray wordArray = result.get();
                wordArray.addValue(s);
            } else if (!result.isPresent()) {
                WordArray newWordArray = new WordArray(s.length());
                newWordArray.addValue(s);
                list.add(newWordArray);
            }
        }

        Collections.sort(list);

        for(WordArray w : list){
            System.out.println(w.toString());
        }

    }
}
