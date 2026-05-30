package woche_03.StringCodierung;

public class Encode {
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
        printResult("000");
        printResult("111");
        printResult("001100111");
        printResult("01111010000");
        printResult("000000000000000");

    }

    public static void printResult(String input) {
        System.out.println(String.format("Input: %s Output: %s", input, encode(input)));
    }

    //TODO
    public static String encode(String input){
        StringBuilder str = new StringBuilder();

        if(input.length() == 1){
            return input;
        }

        for (int i = 0; i < input.length(); i++) {
            int count = 1;

            while(i + 1 < input.length() && input.charAt(i) == input.charAt(i+1)){
                count++;
                if(count == 9){
                    str.append(count);
                    str.append(input.charAt(i));
                    count = 0;
                }
                i++;
            }

            if(count == 1){
                str.append(input.charAt(i));
            }
            else{
                str.append(count);
                str.append(input.charAt(i));
            }

        }
        return str.toString();
    }
}
