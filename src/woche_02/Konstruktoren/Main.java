package woche_02.Konstruktoren;

public class Main {
    public static void main(String[] args) {
        printAnimal(new Animal());
        printAnimal(new Animal(3));
        printAnimal(new Animal("Garry"));
        Animal animal4 = new Animal("Garry",8);
        printAnimal(animal4);
        printAnimal(new Animal(animal4));
    }

    public static void printAnimal(Animal animal) {
        System.out.println(String.format("[%s, %d]", animal.getName(), animal.getLegs()));
    }
}
