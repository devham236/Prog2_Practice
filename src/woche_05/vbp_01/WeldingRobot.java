package woche_05.vbp_01;

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
