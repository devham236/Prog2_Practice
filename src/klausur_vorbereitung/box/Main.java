package klausur_vorbereitung.box;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main{
    public static void main (String[] args){
        System.out.println("Aufgabe 1 von Hamza Mirza, Start:");
        Random random = new Random();
        List<Box> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            Box box = new Box(Integer.toString(i), random.nextInt(1, 20));
            list.add(box);
        }

        System.out.println("\nUnsortierte Liste: ");
        for(Box b : list){
            System.out.println(b.toString());
        }

        Collections.sort(list);

        System.out.println("\nSortierte Liste: ");
        for(Box b : list){
            System.out.println(b.toString());
        }

        System.out.println("\nAufgabe 1 Ende");
    }
}