package klausur_vorbereitung.smurfs;

public class Main {
    public static void main(String[] args) {
        Human[] hannover = new Human[2];
        Smurf[] schlumpfhausen = new Smurf[2];
        TwoLegged[] bicycleClub = new TwoLegged[4];

        System.out.println("Hannover: ");
        Human h1 = new Human();
        h1.setName("Erwin");
        Human h2 = new Human();
        h2.setName("Sabine");
        hannover[0] = h1;
        hannover[1] = h2;

        for (int i = 0; i < hannover.length; i++) {
            System.out.println(hannover[i]);
        }

        System.out.println();

        System.out.println("Schlumpfhausen: ");
        Smurf s1 = new Smurf();
        s1.setName("Schlaubischlumpf");
        Smurf s2 = new Smurf();
        s2.setName("Schlumpfine");
        schlumpfhausen[0] = s1;
        schlumpfhausen[1] = s2;

        for (int i = 0; i < schlumpfhausen.length; i++) {
            System.out.println(schlumpfhausen[i]);
        }

        System.out.println();

        bicycleClub[0] = h1;
        bicycleClub[1] = s1;
        bicycleClub[2] = h2;
        bicycleClub[3] = s2;

        System.out.println("Bicycleclub: ");

        for (int i = 0; i < bicycleClub.length; i++) {
            System.out.println(bicycleClub[i]);
        }

    }
}
