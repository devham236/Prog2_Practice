package woche_09.aufgabe_18;

public class Memory {

    private MemoryBlock head;

    public Memory() {
        this.head = new MemoryBlock(0, 4096, false);
    }

    public int malloc(int size) {
        MemoryBlock current = head;

        while (current != null) {
            if (!current.isAllocated && current.size >= size) {

                if (current.size > size) {
                    MemoryBlock newBlock = new MemoryBlock(current.startPosition + size, current.size - size, false);
                    newBlock.next = current.next;
                    current.next = newBlock;
                    current.size = size;
                }

                current.isAllocated = true;
                return current.startPosition;
            }
            current = current.next;
        }

        return -1;
    }

    public boolean free(int startPosition) {
        MemoryBlock current = head;
        MemoryBlock target = null;

        while (current != null) {
            if (current.startPosition == startPosition && current.isAllocated) {
                target = current;
                break;
            }
            current = current.next;
        }

        if (target == null) {
            return false;
        }

        target.isAllocated = false;

        current = head;
        while (current != null && current.next != null) {
            if (!current.isAllocated && !current.next.isAllocated) {
                current.size += current.next.size;
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return true;
    }
}
