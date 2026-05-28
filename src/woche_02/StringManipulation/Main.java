package woche_02.StringManipulation;

public class Main {

    public static void main(String[] args) {
        if (args.length >= 1) {
            String input = "";
            for (int i = 0; i < args.length; i++) {
                input += args[i];
                if (i != args.length - 1) input += " ";
            }
            System.out.println(Manipulation.manipulation(input));
            return;
        }
        Manipulation.tester();
    }
}
