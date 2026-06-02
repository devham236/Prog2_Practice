package klausur_vorbereitung;

import java.util.Scanner;

public class Tree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Höhe: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height ; i++) {
            for(int j = 0; j < height - i; j++){
                System.out.print(" ");
            }

            for (int k = 0; k < (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int l = 0; l < height - 1; l++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}