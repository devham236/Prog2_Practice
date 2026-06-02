package klausur_vorbereitung.box;

import java.util.Random;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Box> boxes = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            boxes.add(new Box(String.format("Typ: %d", i), random.nextInt(20)));
        }

        System.out.println("Unsortierte Liste:");
        for(Box b : boxes){
            System.out.println(b);
        }

        Collections.sort(boxes);

        System.out.println();
        System.out.println("Sortierte Liste:");
        for(Box b : boxes){
            System.out.println(b);
        }
    }
}
