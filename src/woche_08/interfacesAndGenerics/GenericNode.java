package woche_08.interfacesAndGenerics;

import java.util.List;

public interface GenericNode<T> {
    GenericNode<T> getLeft();
    GenericNode<T> getRight();
    T getValue();
    boolean isLeaf();
    List<GenericNode<T>> getNodes();
}