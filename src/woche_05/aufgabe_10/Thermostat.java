package woche_05.aufgabe_10;

public class Thermostat implements ToggleDevice{
    private boolean state;
    private double temp;

    @Override
    public void toggleTargetState(boolean target){
        this.state = target;

        if (this.state){
            temp = 21.0;
        }
        else{
            temp = 15.0;
        }
    }

    @Override
    public boolean getState(){
        return this.state;
    }

    @Override
    public double powerConsumption(){
        if(this.state){
            return 1.5;
        }

        return 0.0;
    }
}
