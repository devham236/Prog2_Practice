package woche_07.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        int input = scanner.nextInt();
        list.add(input);

        while(input != -1){
            input = scanner.nextInt();
            if (input == -1){
                break;
            }
            list.add(input);
        }

        System.out.println(list.toString());

        scanner.close();
    }
}
