package woche_03.LinkedList;

public class Node {
    private int value;
    private Node next;
    private Node previous;

    public Node(int v){
        this.value = v;
        this.next = null;
        this.previous = null;
    }

    public Node(int value, Node previous){
        this(value);
        this.previous = previous;

        if (previous != null) {
            previous.setNext(this);
        }
    }

    public void setNext(Node next){
        this.next = next;
    }

    public boolean hasNext(){
        return this.next != null;
    }

    public Node getNext(){
        return this.next;
    }

    public void setPrevious(Node previous){
        this.previous = previous;
    }

    public boolean hasPrevious(){
        return this.previous != null;
    }

    public Node getPrevious(){
        return this.previous;
    }

    public int getValue(){
        return this.value;
    }

    public String toString(){
        return String.format("(%d)", this.value);
    }
}
