package woche_08.interfacesAndGenerics;

public class TreeManager {
    public static void main(String[] args) {
        GenericNode<Integer> Tree1 = new Node<Integer>(
                10,
                new Node<Integer>(5),
                new Node<Integer>(20, new Node<Integer>(15), new Node<Integer>(25))
        );
        System.out.println(Tree1);
        Tree1.getNodes().forEach((node) -> System.out.print(" " + node.getValue()));
        System.out.println();
        System.out.println(Tree1.getLeft());
        System.out.println(Tree1.getRight());
        System.out.println(Tree1.isLeaf());


        GenericNode<String> Tree2 = new Node<>(
                "example",
                new Node<>("is", new Node<>("This"), new Node<>("an")),
                new Node<>("with", null, new Node<>("Strings"))
        );
        System.out.println(Tree2);
        Tree2.getNodes().forEach((node) -> System.out.print(" " + node.getValue()));
        System.out.println();
        System.out.println(Tree2.getLeft());
        System.out.println(Tree2.getRight());
        System.out.println(Tree2.isLeaf());
    }
}
