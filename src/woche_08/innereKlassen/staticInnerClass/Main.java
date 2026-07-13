package woche_08.innereKlassen.staticInnerClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main(scanner.nextInt());
        System.out.println(Main.InnerMain.compute(main.getNumber()));
    }

    //TODO
    public static class InnerMain{
        static int compute(int number){
            return Math.round((float) (8*number/7));
        }
    }


    private int number;

    public Main(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
