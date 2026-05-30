package woche_03.StringCodierung;

public class Decode {
    public static void main(String[] args) {
        if (args.length == 1) {
            printResult(args[0]);
            return;
        }
        tester();
    }

    //test method
    public static void tester() {
        printResult("1");
        printResult("30");
        printResult("31");
        printResult("20212031");
        printResult("0410140");
        printResult("9060");

    }

    public static void printResult(String input) {
        System.out.println(String.format("Input: %s Output: %s", input, decode(input)));
    }

    //TODO
    public static String decode(String input){
        if (input.length() == 1) return input;

        StringBuilder str = new StringBuilder();
        int i = 0;

        while (i < input.length()){
            char current = input.charAt(i);

            if (i + 1 < input.length() &&
                    ((current >= '2' && current <= '9') ||
                            (current == '0' && input.charAt(i + 1) == '0') ||
                            (current == '1' && input.charAt(i + 1) == '1'))) {

                int amount = current - '0';
                char characterToRepeat = input.charAt(i + 1);

                for (int j = 0; j < amount; j++) {
                    str.append(characterToRepeat);
                }

                i += 2;
            } else {
                str.append(current);
                i++;
            }
        }

        return str.toString();
    }
}
