package woche_03.WechselGeldRechner.EuroDenominator;

public enum EuroDenomination{
    A(1),
    B(2),
    C(5),
    D(10),
    E(20),
    F(50),

    G(100),
    H(200),

    I(500),
    J(1000),
    K(2000),
    L(5000),
    M(10000),
    N(20000);
    private final int value;

    EuroDenomination(int v){
        this.value = v;
    }

    public int centValue(){
        return this.value;
    }

    public String representation(){
        int result = this.value / 100;
        StringBuilder rep = new StringBuilder();

        if(result < 1){
            rep.append(String.format("[Cent: %d]", this.value));
        }
        else if(result >= 1){
            rep.append(String.format("[Euro: %d]", result));
        }

        return rep.toString();
    }
}