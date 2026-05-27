package woche_01;

public class CharacterArray{
    public static void main(String[] args){
        char[] charArray = {'W', 'O', 'R', 'L', 'D'};

        for(int i = 0; i < charArray.length; i++){
            System.out.print(charArray[i]);
        }

        System.out.println();

        for(int j = charArray.length - 1; j >= 0; j--){
            System.out.print(charArray[j]);
        }

        System.out.println();
    }
}