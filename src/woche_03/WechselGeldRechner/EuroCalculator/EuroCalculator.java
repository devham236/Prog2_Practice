package woche_03.WechselGeldRechner.EuroCalculator;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.exit;

public class EuroCalculator {
    public static EuroDenomination[] calculate(EuroDenomination[] input, int price){
        int totalInputInCent = 0;

        for (EuroDenomination euro : input) {
            totalInputInCent += euro.centValue();
        }

        if (totalInputInCent < price) {
            exit(1);
        }

        int changeSumInCent = totalInputInCent - price;

        List<EuroDenomination> changeList = new ArrayList<>();

        EuroDenomination[] denominations = EuroDenomination.values();

        for (int i = denominations.length - 1; i >= 0; i--) {
            EuroDenomination currentDenomination = denominations[i];
            int denomValue = currentDenomination.centValue();

            while (changeSumInCent >= denomValue) {
                changeList.add(currentDenomination);
                changeSumInCent -= denomValue;
            }
        }

        return changeList.toArray(new EuroDenomination[0]);
    }
}
