package woche_08.aufgabe_15;

public class Main {
    public static void main(String[] args) {
        ObserverManager manager = new ObserverManager();

        Observer ob1 = new Observer();
        Observer ob2 = new Observer();

        manager.addObserver(ob1);
        manager.addObserver(ob2);

        System.out.printf("Observer 1 State: %.2f\n", ob1.getState());
        System.out.printf("Observer 2 State: %.2f\n", ob2.getState());

        System.out.println("Verteile Wert: 42.5");
        manager.notifyObservers(42.5);

        System.out.printf("Observer 1 State: %.2f\n", ob1.getState());
        System.out.printf("Observer 2 State: %.2f\n", ob2.getState());
    }
}
