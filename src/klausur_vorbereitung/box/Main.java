package klausur_vorbereitung.box;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Box> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            Box box = new Box(Integer.toString(i), rand.nextInt(0, 20));
            list.add(box);
        }

        System.out.println("Unsortierte Liste:");
        for(Box b : list){
            System.out.println(b.toString());
        }

        Collections.sort(list);

        System.out.println();

        System.out.println("Sortierte Liste:");
        for(Box b : list){
            System.out.println(b.toString());
        }
    }
}
