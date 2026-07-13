package woche_08.hashMapAndInterface;

public class InformationPackage {

    private final Operation operation;
    private final int a;
    private final int b;

    public InformationPackage(Operation operation, int a, int b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
    }

    public Operation getOperation() {
        return operation;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}