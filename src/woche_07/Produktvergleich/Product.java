package woche_07.Produktvergleich;

import java.util.*;

public class Product implements Comparable<Product>{
    public String name;
    public double price;

    public Product(String n, double p){
        this.name = n;
        this.price = p;
    }

    public int compareTo(Product obj){
        int result = this.name.compareTo(obj.name);

        if(result == 0){
            return Double.compare(this.price, obj.price);
        }

        return result;
    }

    public static List<Product> cleanList(List<Product> list){
        if (list == null) {
            return new ArrayList<>();
        }

        Set<Product> sortedUniqueSet = new TreeSet<>(list);

        return new ArrayList<>(sortedUniqueSet);
    }

    public String toString(){
        return String.format("%s: %f", this.name, this.price);
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.price);
    }
}