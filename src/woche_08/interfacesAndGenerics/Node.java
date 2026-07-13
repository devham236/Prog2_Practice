package woche_08.interfacesAndGenerics;

import java.util.ArrayList;
import java.util.List;

public class Node<T> implements GenericNode<T>{
    private T value;
    private GenericNode<T> left;
    private GenericNode<T> right;

    public Node(T value, GenericNode<T> left, GenericNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(T value) {
        this(value, null, null);
    }


    public GenericNode<T> getLeft() {
        return left;
    }

    public GenericNode<T> getRight() {
        return right;
    }

    public T getValue() {
        return value;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public List<GenericNode<T>> getNodes() {
        List<GenericNode<T>> result = new ArrayList<>();
        if (left != null) result.addAll(left.getNodes());
        result.add(this);
        if (right != null) result.addAll(right.getNodes());
        return result;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        if (left != null) builder.append(left);
        builder.append(value);
        if (right != null) builder.append(right);
        builder.append(")");
        return builder.toString();
    }
}
