package woche_01;

public class Char_Array {
    public static void main(String[] args) {
        char[] char_array = {'W', 'O', 'R', 'L', 'D'};

        String word_forward = "";
        String word_backwards = "";
        for (int i = 0, j = char_array.length - 1; i < char_array.length; i++, j--) {
            word_forward += char_array[i];
            word_backwards += char_array[j];
        }

        System.out.println(word_forward);
        System.out.println(word_backwards);

    }
}
