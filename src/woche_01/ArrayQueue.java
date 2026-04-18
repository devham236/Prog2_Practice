package woche_01;

public class ArrayQueue {
    public static void main(String[] args) {
        int[] test = init(5);
        printQueue(test);
        System.out.println();
        System.out.println(contains(test, 1));
        System.out.println(push(test, 3));
        printQueue(test);
    }

    public static int[] init(int length) {
        int[] queue = new int[length];

        for (int i = 0; i < queue.length; i++) {
            queue[i] = -1;
        }

        return queue;
    }

    public static void printQueue(int[] queue){
        System.out.print("[");
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i]);

            if (i < queue.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static boolean contains(int[] queue, int value){
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == value){
                return true;
            }
        }
        return false;
    }

    public static boolean push(int[] queue, int value){
        if (contains(queue, value)) {
            return false;
        }

        int[] newQueue = new int[queue.length + 1];

        for (int i = 0; i < queue.length; i++) {
            newQueue[i] = queue[i];
        }

        newQueue[newQueue.length - 1] = value;

        return true;
    }
}
