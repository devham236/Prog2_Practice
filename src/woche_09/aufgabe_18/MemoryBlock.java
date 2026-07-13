package woche_09.aufgabe_18;

public class MemoryBlock {
    int startPosition;
    int size;
    boolean isAllocated;
    MemoryBlock next;

    public MemoryBlock(int startPosition, int size, boolean isAllocated) {
        this.startPosition = startPosition;
        this.size = size;
        this.isAllocated = isAllocated;
    }
}
