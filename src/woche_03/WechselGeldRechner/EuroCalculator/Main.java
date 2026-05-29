package woche_03.WechselGeldRechner.EuroCalculator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        if (args.length >= 1) {
            int price = Integer.parseInt(args[0]);
            EuroDenomination[] input = new EuroDenomination[args.length - 1];
            for (int i = 1; i < args.length; i++) {
                input[i - 1] = EuroDenomination.valueOf(args[i]);
            }
            EuroCalculator EuroCalculator = new EuroCalculator();
            EuroDenomination[] result = EuroCalculator.calculate(input, price);
            Arrays.sort(result);
            printArray(result);
            return;
        }

        tester();
    }

    public static void printArray(EuroDenomination[] input) {
        System.out.println(Arrays.toString(input));
    }


    public static void tester() {
        //TODO
        EuroDenomination[] test1 = {EuroDenomination.ONE_HUNDRED_EURO, EuroDenomination.FIFTY_EURO};
        System.out.println(Arrays.toString(EuroCalculator.calculate(test1, 10000)));
    }
}
