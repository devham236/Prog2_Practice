package klausur_vorbereitung;
import java.util.Scanner;

public class Muster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int input = scanner.nextInt();

        for(int i = 1; i <= input; i++){
            for (int j = 0; j < input - i; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k < 2 * i - 1; k++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int l = 0; l < input - 1; l++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
