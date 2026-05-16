package woche_06.aufgabe_11;

public class Main {
    public static void main(String[] args) {
        String testCode = "1234";

        try {
            Validate.validateInput(testCode);
            System.out.println("invalid code!");

        } catch (InvalidException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}
