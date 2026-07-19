package klausur_vorbereitung.smurf;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Erwin");
        Human h2 = new Human();
        h2.setName("Sabine");

        Smurf s1 = new Smurf();
        s1.setName("Schlaubischlumpf");
        Smurf s2 = new Smurf();
        s2.setName("Schlumpfine");

        Human[] hannover = {h1, h2};
        Smurf[] schlumpfhausen = {s1, s2};
        TwoLegged[] bicycleClub = {h1, s1, h2, s2};

        System.out.println("\nSchlumpfhausen:");
        for(Smurf s : schlumpfhausen){
            System.out.println(s.getName());
        }

        System.out.println("\nHannover:");
        for(Human h : hannover){
            System.out.println(h.getName());
        }

        System.out.println("\nBicycleClub:");
        for(TwoLegged t : bicycleClub){
            System.out.println(t.getName());
        }
    }
}
