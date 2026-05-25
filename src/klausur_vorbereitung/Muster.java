package klausur_vorbereitung;
import java.util.Scanner;

public class Muster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.print("Enter a number: ");
        input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {


            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            for (int j = 0; j < input - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        scanner.close();

    }
}
