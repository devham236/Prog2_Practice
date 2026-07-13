package woche_08.aufgabe_15;

public class Observer implements ObserverInterface{
    private double state = -1.0;

    public Observer(){}

    public double getState(){
        return this.state;
    }

    @Override
    public void update(double d) {
        this.state = d;
    }
}
