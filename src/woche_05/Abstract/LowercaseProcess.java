package woche_05.Abstract;

public class LowercaseProcess extends Process {
    void handle(String input){
        StringBuilder str = new StringBuilder();

        str.append(Character.toLowerCase(input.charAt(0)));

        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);

            if(i % 2 == 0){
                str.append(Character.toLowerCase(c));
            }
            else{
                str.append(c);
            }
        }

        result = str.toString();
    }
}
