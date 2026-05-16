package woche_01.aufgabe_02;

public class Radix {
    public static void main(String[] args) {
//        int[] test = {1, 2, 3, 4, 5};
//        System.out.println(maxValue(test));
        int[] test = {31, 56, 8};
        int test_num = 10;
        int[] result = getDigitsAtPlaceValue(test, test_num);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int maxValue(int[] arr){
        int result = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(result < arr[i]){
                result = arr[i];
            }
        }

        return result;
    }

    private static int[] getDigitsAtPlaceValue(int[] arr, int num){
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % num == arr[i]){
                result[i] = 0;
            }
            else{
                result[i] = (arr[i] / num) % 10;
            }
        }

        return result;
    }

    private static int[] sort(int[] arr){
        if (arr == null || arr.length == 0) return arr;

        int max = maxValue(arr);
        int n = arr.length;

        for (int exp = 1; max / exp > 0; exp *= 10) {

            int[] output = new int[n];
            int[] count = new int[10];

            for (int i = 0; i < n; i++) {
                int digit = (arr[i] / exp) % 10;
                count[digit]++;
            }

            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            for (int i = n - 1; i >= 0; i--) {
                int digit = (arr[i] / exp) % 10;
                output[count[digit] - 1] = arr[i];
                count[digit]--;
            }

            for (int i = 0; i < n; i++) {
                arr[i] = output[i];
            }
        }

        return arr;
    }
}
