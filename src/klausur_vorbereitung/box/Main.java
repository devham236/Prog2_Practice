package klausur_vorbereitung.box;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Box box1 = new Box("0", 8);
        Box box2 = new Box("0", 18);
        Box box3 = new Box("0", 9);
        Box box4 = new Box("0", 4);
        Box box5 = new Box("0", 19);

        List<Box> boxList = new ArrayList<>();

        boxList.add(box1);
        boxList.add(box2);
        boxList.add(box3);
        boxList.add(box4);
        boxList.add(box5);

        System.out.println("Unsortierte Liste: ");
        for(int i = 0; i < boxList.size(); i++){
            System.out.println(boxList.get(i));
        }

        Collections.sort(boxList);

        System.out.println("Sortierte Liste: ");
        for(int i = 0; i < boxList.size(); i++){
            System.out.println(boxList.get(i));
        }
    }
}