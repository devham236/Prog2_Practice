package woche_04.Stringbuilder;

import java.util.Arrays;
import java.util.Scanner;

public class Stringsplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String: ");
        String input = scanner.nextLine();

        String[] arr = input.split(" ");

        for (int i = 0; i < arr.length; i += 2) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }

        scanner.close();
    }
}
