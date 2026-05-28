package woche_02.StringManipulation;

public class Manipulation {
    public static void tester() {
        //Sie können hier ihre Methode mit Ausgaben testen
        System.out.println(manipulation("dies ist ein test."));
    }

    //TODO Implementieren Sie die geforderte Methode hier
    public static String manipulation(String input){
        StringBuilder sb = new StringBuilder(input);
        boolean nextCharisFirst = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c != ' ' && nextCharisFirst){
                sb.setCharAt(i, (char) (input.charAt(i) - 32));
                nextCharisFirst = false;
            }

            if(c == ' '){
                nextCharisFirst = true;
            }
        }

        return sb.toString();
    }
}
