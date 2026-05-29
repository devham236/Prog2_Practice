package woche_03.StringTransformation;

public class Transformer {
    public static void main(String[] args) {
        if (args.length == 1) {
            tester(args[0]);
            return;
        }
        tester("TEST");
    }

    public static void tester(String input) {
        System.out.println(input);
        long transformed = transform(input);
        System.out.println(transformed);
        System.out.println(transform(transformed));
    }

    //TODO
    public static long transform(String input){
        long result = 0;
        for (int i = 0; i < input.length(); i++) {
            long curr = ((long) input.charAt(i)) * ((long) Math.pow(100, i));
            result += curr;
        }

        return result;
    }

    public static String transform(long input){
        StringBuilder sb = new StringBuilder();

        long value = input;

        while(value != 0){
            char c = (char) (value % 100);
            sb.append(c);
            value /= 100;
        }

        return sb.toString();
    }
}
