package woche_04.Parameter;

import java.util.Arrays;

public class Input {
    //TODO
    public static void main(String[] args) {
        if(args.length == 2){
            int start = Integer.parseInt(args[0]);
            int end = Integer.parseInt(args[1]);

            for (int i = start; i < end; i++) {
                System.out.println(i);
            }
        }
        else{
            System.out.println("Error");
        }
    }
}
