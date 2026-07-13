package woche_08.mvcPattern;

public class Model {
    private String text;

    public Model() {
        text = "Not Clicked";
    }

    public void changeText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
