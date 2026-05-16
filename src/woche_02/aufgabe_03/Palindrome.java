package woche_02.aufgabe_03;

public class Palindrome {
    public static boolean checkPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            char char_left = str.charAt(left);
            char char_right = str.charAt(right);

            if(!Character.isLowerCase(char_left)){
                left++;
            }
            else if(!Character.isLowerCase(char_right)){
                right--;
            }
            else {
                if(char_left != char_right){
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}
