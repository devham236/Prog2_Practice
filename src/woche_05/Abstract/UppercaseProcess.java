package woche_05.Abstract;

public class UppercaseProcess extends Process{
    void handle(String input){
        StringBuilder str = new StringBuilder();

        str.append(Character.toUpperCase(input.charAt(0)));

        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);

            if(i % 2 == 0){
                str.append(Character.toUpperCase(c));
            }
            else{
                str.append(c);
            }
        }

        result = str.toString();
    }
}
