package woche_03.MethodOverload;

public class Addition {
    public static void main(String[] args) {
        System.out.println(add(10, 5));
        System.out.println(add(10.0, 5.5));
        System.out.println(add(10.5, 5));
        System.out.println(add(true, false));
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static double add(double a, int b){
        return a + b;
    }

    public static boolean add(boolean a, boolean b){
        return a && b;
    }
}
