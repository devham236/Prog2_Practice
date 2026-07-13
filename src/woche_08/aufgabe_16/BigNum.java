package woche_08.aufgabe_16;

public class BigNum {
    private int[] blocks;

    public BigNum(String num){
        int blocksCount = (num.length() + 3) / 4;
        this.blocks = new int[blocksCount];

        int blockIndex = 0;
        int stringIndex = num.length();

        while(stringIndex > 0){
            int start = Math.max(0, stringIndex - 4);

            String blockString = num.substring(start, stringIndex);

            this.blocks[blockIndex] = Integer.parseInt(blockString);

            blockIndex++;
            stringIndex = start;
        }
    }

    public int getBlocksAmount() {
        return this.blocks.length;
    }

    public boolean isLessThan(BigNum other){
        if (this.blocks.length < other.blocks.length) {
            return true;
        }
        if (this.blocks.length > other.blocks.length) {
            return false;
        }

        for (int i = this.blocks.length - 1; i >= 0; i--) {
            if (this.blocks[i] < other.blocks[i]) {
                return true;
            }
            if (this.blocks[i] > other.blocks[i]) {
                return false;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = this.blocks.length - 1; i >= 0; i--) {
            sb.append(String.format("%04d", this.blocks[i]));
        }

        return sb.toString();
    }
}
