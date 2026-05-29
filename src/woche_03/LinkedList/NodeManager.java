package woche_03.LinkedList;

public class NodeManager {
    private Node head;
    private Node tail;

    public NodeManager(int value){
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
    }

    void add(int value) {
        Node newNode = new Node(value, this.tail);
        this.tail = newNode;
    }

    public boolean remove(int value) {
        Node current = head;

        // 1. Knoten mit dem passenden Wert suchen
        while (current != null) {
            if (current.getValue() == value) {
                break; // Gefunden! Schleife abbrechen
            }
            current = current.getNext();
        }

        // Falls der Wert nicht in der Liste existiert
        if (current == null) {
            return false;
        }

        // 2. Den gefundenen Knoten aus der Liste heraustrennen (Die 4 Fälle)

        // Fall A: Liste hat nur ein einziges Element
        if (current == head && current == tail) {
            head = null;
            tail = null;
        }
        // Fall B: Element ist am Anfang der Liste (Kopf)
        else if (current == head) {
            head = head.getNext();
            head.setPrevious(null);
        }
        // Fall C: Element ist am Ende der Liste (Tail)
        else if (current == tail) {
            tail = tail.getPrevious();
            tail.setNext(null);
        }
        // Fall D: Element ist mittendrin
        else {
            current.getPrevious().setNext(current.getNext());
            current.getNext().setPrevious(current.getPrevious());
        }

        return true; // Erfolgreich gelöscht
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current);
            if (current.hasNext()) System.out.print(" ");
            current = current.getNext();
        }
        System.out.println("");
    }


    public static void tester() {
        //TODO
    }

    public static void main(String[] args) {
        if (args.length >= 1) {
            try {
                NodeManager manager = new NodeManager(Integer.parseInt(args[0]));
                manager.print();
                for (int i = 1; i < args.length; i++) {
                    int value = Integer.parseInt(args[i]);
                    if (value >= 0) {
                        manager.add(value);
                    } else {
                        System.out.println(manager.remove(value * -1));
                    }
                    manager.print();
                }
            } catch (NumberFormatException e) {
                System.out.println("Parsing error");
            }
            return;
        }
        tester();
    }
}
