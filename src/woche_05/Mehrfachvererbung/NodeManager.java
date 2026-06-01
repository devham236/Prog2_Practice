package woche_05.Mehrfachvererbung;

public class NodeManager {
    public static void main(String[] args) {
        Composable[] nodes = {
                new Node(10),
                new Node(20),
                new Node(30)
        };

        for (Composable node : nodes) {
            System.out.println(String.format("Node: %s, %d", node.toString(), node.assess()));
            node.change(node.assess());
            System.out.println(String.format("Node: %s, %d", node.toString(), node.assess()));
        }
    }
}
