package woche_07.Generics;

public class List {
    public static void main(String[] args) {
        Node<String> stringHead = null;
        Node<Integer> intHead = null;

        for (String arg : args) {
            if (arg.chars().allMatch(Character::isDigit)) {
                if (intHead == null) intHead = new Node<Integer>(Integer.parseInt(arg));
                else intHead = new Node<Integer>(Integer.parseInt(arg), intHead);
            } else {
                if (stringHead == null) stringHead = new Node<String>(arg);
                else stringHead = new Node<String>(arg, stringHead);
            }
        }

        System.out.println(intHead);
        System.out.println(stringHead);
    }
}
