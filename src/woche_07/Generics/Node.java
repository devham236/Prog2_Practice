package woche_07.Generics;

public class Node<T> {
    T value;
    Node<T> next;

    public Node(T v){
        this.value = v;
    }

    public Node(T v, Node<T> nextNode){
        this.value = v;
        this.next = nextNode;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public T getValue() {
        return this.value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = this;

        while (current != null) {
            sb.append(current.value);

            if (current.next != null) {
                sb.append(" ");
            }

            current = current.next;
        }

        return sb.toString();
    }
}
