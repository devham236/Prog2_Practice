package woche_05.aufgabe_09;

public abstract class Robot {
    protected String serialNum;
    protected int batteryPercentage;

    public Robot(String num){
        this.serialNum = num;
        this.batteryPercentage = 100;
    }

    public void recharge(){
        this.batteryPercentage = 100;
    }

    public abstract void execute();
}
