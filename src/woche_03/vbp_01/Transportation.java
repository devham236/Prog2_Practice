package woche_03.vbp_01;

public enum Transportation {
    STANDARD,
    PRIORITY,
    HEAVY;

    public double calculateCost(double base){
        double total = base;

        switch(this) {
            case STANDARD -> total *= 1.0;
            case PRIORITY -> total *= 2.5;
            case HEAVY -> total = (total * 5.5) + 100.0;
            default -> total = 0;
        }

        return total;
    }

    public boolean checkWeight(double weight){
        switch(this) {
            case STANDARD -> {
                return weight > 0 && weight <= 50.0;
            }
            case PRIORITY -> {
                return weight > 50.0 && weight <= 250.0;
            }
            case HEAVY -> {
                return weight > 250.0 && weight <= 750.0;
            }
            default -> {
                return true;
            }
        }
    }

    public int getShippingTime(){
        switch(this) {
            case STANDARD -> {
                return 8;
            }
            case PRIORITY -> {
                return 2;
            }
            case HEAVY -> {
                return 14;
            }
            default -> {
                return 0;
            }
        }
    }
}
