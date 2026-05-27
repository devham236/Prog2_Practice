package klausur_vorbereitung.box;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Box box1 = new Box("clothes", random.nextInt(100));
        Box box2 = new Box("books", random.nextInt(100));
        Box box3 = new Box("games", random.nextInt(100));
        Box box4 = new Box("furniture", random.nextInt(100));
        Box box5 = new Box("uranium", random.nextInt(100));

        List<Box> list = new ArrayList<>();
        list.add(box1);
        list.add(box2);
        list.add(box3);
        list.add(box4);
        list.add(box5);

        System.out.println("unsorted list: ");
        for(int i = 0; i < list.size(); i++){
            System.out.printf("%s \n", list.get(i));
        }

        Collections.sort(list);

        System.out.println("sorted list: ");
        for(int i = 0; i < list.size(); i++){
            System.out.printf("%s \n", list.get(i));
        }
    }
}
