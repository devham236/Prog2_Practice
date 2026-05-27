package woche_01;

public class Collatz {
    public static void main(String[] args) {
        int[] result = collatz(3, 11);

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d ", result[i]);
        }
    }

    public static int[] collatz(int start, int n){
        int[] arr = new int[n];
        int count = 0;
        arr[0] = start;

        while(count < arr.length - 1){
            int curr = arr[count];

            if(curr % 2 == 0){
                curr = curr / 2;
            } else {
                curr = curr * 3 + 1;
            }
            arr[count+1] = curr;

            count++;
        }

        return arr;
    }
}
