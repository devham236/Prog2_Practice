package woche_03.WechselGeldRechner.EuroCalculator;

public enum EuroDenomination {
    ONE_CENT(1),TWO_CENT(2),FIVE_CENT(5),TEN_CENT(10),TWENTY_CENT(20),FIFTY_CENT(50),
    ONE_EURO(100),TWO_EURO(200),
    FIVE_EURO(500),TEN_EURO(1000),TWENTY_EURO(2000),FIFTY_EURO(5000),ONE_HUNDRED_EURO(10000),TWO_HUNDRED_EURO(20000);

    private final int value;

    private EuroDenomination(int value) {
        this.value = value;
    }


    public int centValue() {
        return this.value;
    }


    public String representation() {
        int value = this.centValue();
        String representation = "";
        if (value % 100 == 0) {
            representation = "Euro";
            value /= 100;
        } else {
            representation = "Cent";
        }
        return String.format("[%s: %d]", representation, value);
    }
}