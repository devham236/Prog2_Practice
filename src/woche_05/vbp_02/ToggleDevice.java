package woche_05.vbp_02;

public interface ToggleDevice {
    public void toggleTargetState(boolean target);
    public boolean getState();
    default double powerConsumption() {
        return 0.0;
    };
}
