package woche_05.Mehrfachvererbung;

public class Node implements Composable{
    private int value;
    private int numberOfChanges;

    public Node(int value) {
        this.value = value;
        numberOfChanges = 1;
    }

    public String toString() {
        return Integer.toString(value);
    }

    public int assess(){
        double result = Math.pow(this.value - this.numberOfChanges, 2);

        return (int) result;
    }

    public void change(int value){
        if(value != this.value){
            this.value = value;
            this.numberOfChanges++;
        }
    }
}
