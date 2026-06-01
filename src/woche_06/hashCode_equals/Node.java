package woche_06.hashCode_equals;

//TODO class Node
public class Node{
    int value;
    Node next;

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    public Node(int value){
        this.value = value;
    }

    public Node getNext(){
        return this.next;
    }

    public int getValue(){
        return this.value;
    }

    @Override
    public int hashCode(){
        return this.value % 255;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Node){
            Node o = (Node) obj;

            return this.getValue() == o.getValue();
        }

        return false;
    }
}