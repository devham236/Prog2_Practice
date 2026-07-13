package klausur_vorbereitung.box;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Box> list = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < 5; i++){
            list.add(new Box(Integer.toString(i), rand.nextInt(8, 18)));
        }

        System.out.println("Unsortierte Liste:");

        for(Box b : list){
            System.out.println(b);
        }

        Collections.sort(list);

        System.out.println();

        System.out.println("Sortierte Liste:");

        for(Box b : list){
            System.out.println(b);
        }
    }
}
