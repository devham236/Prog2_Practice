package woche_05.aufgabe_09;

public class WeldingRobot extends Robot{
    private double temp;

    public WeldingRobot(String num, double val){
        super(num);
        temp = val;
    }

    public void execute(){
        this.batteryPercentage -= 15;
    }
}
