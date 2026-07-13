package klausur_vorbereitung.textAnalyser;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Eingabe: ");
            String input = scanner.nextLine();

            List<WordArray> list = new ArrayList<>();
            String[] arr = input.split(" ");

            for (String s : arr) {
                WordArray match = null;
                for (WordArray w : list) {
                    if (w.getCount() == s.length()) {
                        match = w;
                        break;
                    }
                }

                if (match != null) {
                    match.addValue(s);
                } else {
                    WordArray newWordArray = new WordArray(s.length());
                    newWordArray.addValue(s);
                    list.add(newWordArray);
                }
            }

            Collections.sort(list);

            System.out.println("\nAusgabe:");
            for (WordArray w : list) {
                System.out.println(w.toString());
            }

            System.out.println("\nWollen Sie noch einen Text analysieren (j/n)?");
            String response = scanner.nextLine();

            if (response.equals("n")) {
                break;
            }
        }

        scanner.close();

    }
}
