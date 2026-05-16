package woche_05.aufgabe_10;

public interface ToggleDevice {
    public void toggleTargetState(boolean target);
    public boolean getState();
    default double powerConsumption() {
        return 0.0;
    };
}
