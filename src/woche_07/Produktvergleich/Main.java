package woche_07.Produktvergleich;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Apfel", 1.20);
        Product p2 = new Product("Banane", 1.99);
        Product p3 = new Product("Apfel", 0.99);
        Product p4 = new Product("Apfel", 1.20);
        Product p5 = new Product("Erdbeere", 2.50);

        List<Product> produktListe = new ArrayList<>();
        produktListe.add(p1);
        produktListe.add(p2);
        produktListe.add(p3);
        produktListe.add(p4);
        produktListe.add(p5);

        System.out.println("Originale Liste:");
        System.out.println(produktListe);

        System.out.println("Liste sortiert und ohne Duplikate:");
        System.out.println(Product.cleanList(produktListe));
    }
}
