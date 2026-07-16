package klausur_vorbereitung.quersumme;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eingabe:");
        String input = scanner.nextLine();

        String[] arr = input.split(" ");

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            int result = NumberAnalyser.analyse(num);
            System.out.println(String.format("%d hat Quersumme: %d", num, result));
        }
    }
}
