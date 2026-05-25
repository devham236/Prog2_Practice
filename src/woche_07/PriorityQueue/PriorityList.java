package woche_07.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityList{
    public static void main(String[] args){
        PriorityQueue<Person> pq = new PriorityQueue<>();

        if(args.length > 0) {
            for(int i = 0; i < args.length; i++){
                Person newPerson = new Person(args[i]);
                pq.add(newPerson);
            }
        }

        Iterator<Person> iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.println(pq.poll());
        }
    }
}