package klausur_vorbereitung.quersumme;

import java.util.Scanner;

public class App{
    public static void main(String[] args){
        System.out.println("Aufgabe 1 von Hamza Mirza, Start:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEingabe per Tastatur:");
        String input = scanner.nextLine();

        String[] strArr = input.split(" ");

        System.out.println("\nAusgabe:");
        for(int i = 0; i < strArr.length; i++){
            int num = Integer.parseInt(strArr[i]);
            int result = NumberAnalyser.analyse(num);

            System.out.println(String.format("%d hat die Quersumme %d", num, result));
        }

        scanner.close();
        System.out.println("\nAufgabe 1 Ende.");
    }
}