package woche_05.Abstract;

public class ProcessHandler {
    public static void main(String[] args) {
        if (args.length >= 1) {
            apply(new UppercaseProcess(), args[0]);
            apply(new LowercaseProcess(), args[1]);
            return;
        }
        //TODO Sie können hier selbst testen
        apply(new UppercaseProcess(), "test");
        apply(new LowercaseProcess(), "TEST");

    }

    public static void apply(Process process, String input) {
        System.out.println(process.consume(input));
    }
}
