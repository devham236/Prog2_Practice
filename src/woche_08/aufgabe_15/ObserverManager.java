package woche_08.aufgabe_15;

import java.util.ArrayList;
import java.util.List;

public class ObserverManager {
    private final List<ObserverInterface> list;

    public ObserverManager() {
        this.list = new ArrayList<>();
    }

    public void addObserver(ObserverInterface o){
        this.list.add(o);
    }

    public void notifyObservers(double value){
        for(ObserverInterface o : list){
            o.update(value);
        }
    }
}
