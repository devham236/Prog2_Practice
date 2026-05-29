package woche_03.Enums;

public enum Level {
    A(0),
    B(10),
    C(20),
    D(40);

    private final int value;

    private Level(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
