package woche_01.Queue;

public class ArrayQueue {
    public static void main(String[] args) {
        if (args.length >= 1) {
            try {
                int[] queue = init(Integer.parseInt(args[0]));

                for (int i = 1; i < args.length; i++) {
                    int value = Integer.parseInt(args[i]);
                    push(queue, value);
                }
                printQueue(queue);
                for (int i = 0; i < 3; i++) {
                    System.out.println(String.format("Pop: %d", pop(queue)));
                }
                printQueue(queue);

            } catch (NumberFormatException e) {
                System.out.println(String.format("Error Parsing"));
            }
            return;
        }
        // Testausgabe für Studenten dies dürfen Sie nach Bedarf verändern
        int[] queue = init(5);
        printQueue(queue);
        System.out.println(String.format("Element %d ist vorhanden? %b", 10, contains(queue, 10)));
        push(queue, 10);
        System.out.println(String.format("Element %d ist vorhanden? %b", 10, contains(queue, 10)));
        push(queue, 20);
        push(queue, 30);
        printQueue(queue);
        for (int i = 0; i < 4; i++) {
            System.out.println(String.format("Entferntes Element: %d", pop(queue)));
        }
        printQueue(queue);
    }

    public static void printQueue(int[] queue) {
        System.out.print("[");
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i]);
            if (i != queue.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static int[] init(int length) {
        int[] queue = new int[length];
        for (int i = 0; i < queue.length; i++) {
            queue[i] = -1;
        }
        return queue;
    }

    public static boolean contains(int[] queue, int value) {
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == value) return true;
            if (queue[i] == -1) return false;
        }
        return false;
    }

    public static boolean push(int[] queue, int value) {
        if (contains(queue, value)) return false;
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == -1) {
                queue[i] = value;
                return true;
            }
        }
        return false;
    }

    //TODO fügen Sie hier die geforderte Methode ein
    public static int pop(int[] queue){
        int result = queue[0];

        for (int i = 1; i < queue.length; i++){
            queue[i-1] = queue[i];
        }

        queue[queue.length - 1] = -1;

        return result;
    }
}