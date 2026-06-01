package woche_06.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(args[0]);
            BufferedReader buffReader = new BufferedReader(fileReader);

            String line;
            while ((line = buffReader.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch (FileNotFoundException e){
            System.out.println("No valid file");
        }
        catch(IOException e) {
            System.out.println("Reading error");
        }
    }
}
