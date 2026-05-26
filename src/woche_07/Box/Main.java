package woche_07.Box;

public class Main {
    public static void main(String[] args) {
        Wrapper<String> wrapper = new Wrapper<>();

        wrapper.set("Hamza Mirza");

        Wrapper<Integer> wrapper2 = new Wrapper<>();

        wrapper2.set(28);

        System.out.println(wrapper.get());
        System.out.println(wrapper2.get());
    }
}
