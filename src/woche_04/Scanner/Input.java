package woche_04.Scanner;

import java.util.Arrays;
//TODO
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        //TODO
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++){
            int input = scanner.nextInt();

            arr[i] = input + (i * 2);
        }

        print(arr);
        scanner.close();
    }

    public static void print(int[] input) {
        System.out.println(Arrays.toString(input));
    }
}
