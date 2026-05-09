package woche_05.vbp_02;

public class Light implements ToggleDevice{
    private boolean state;

    @Override
    public void toggleTargetState(boolean target) {
        this.state = target;
    }

    @Override
    public boolean getState(){
        return this.state;
    }
}
