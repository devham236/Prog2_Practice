package woche_07.HashMap;
import java.util.HashMap;
import java.util.Scanner;

public class PersonOrdering{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Person> hp = new HashMap<>();
        int count = 0;

        while(count < 5){
            System.out.println("Enter name: ");
            String nameInp = scanner.next();
            Person newPerson = new Person(nameInp);

            System.out.println("Enter number: ");
            int intInp = scanner.nextInt();

            if(hp.containsKey(intInp)){
                System.out.println("number already in hashmap");
                continue;
            }

            hp.put(intInp, newPerson);

            count++;
        }

        System.out.println(hp.toString());

        scanner.close();
    }
}
