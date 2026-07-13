package woche_08.innereKlassen.anonymeInnere;

public class Main extends Animal{
    public Main(String n){
        super(n);
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal(args[0]);
        Main animal2 = new Main(args[1]);

        System.out.println(animal1.toString());
        System.out.println(animal2.toString());

    }

    @Override
    public String toString(){
        return String.format("The name of this animal is: %s", name);
    }
}
