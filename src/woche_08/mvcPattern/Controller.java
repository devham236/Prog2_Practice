package woche_08.mvcPattern;

public class Controller {
    private Model model;
    private View view;

    public void setModel(Model model) {
        this.model = model;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void notifyButtonClick() {
        //TODO Change Text of Model and update View
        this.model.changeText("Clicked");
        this.view.update(this.model);
    }
}
