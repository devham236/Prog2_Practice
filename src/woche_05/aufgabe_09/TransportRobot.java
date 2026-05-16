package woche_05.aufgabe_09;

public class TransportRobot extends Robot{
    private long maxLift;

    public TransportRobot(String num, long val){
        super(num);
        maxLift = val;
    }

    @Override
    public void execute(){
        this.batteryPercentage -= 10;
    }
}
