package klausur_vorbereitung.smurfs;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Erwin");
        Human h2 = new Human();
        h2.setName("Sabine");
        Human[] hannover = new Human[2];
        hannover[0] = h1;
        hannover[1] = h2;

        Smurf s1 = new Smurf();
        s1.setName("Schlaubischlumpf");
        Smurf s2 = new Smurf();
        s2.setName("Schlumpfine");
        Smurf[] schmlumpfhausen = new Smurf[2];
        schmlumpfhausen[0] = s1;
        schmlumpfhausen[1] = s2;

        TwoLegged[] bicycleClub = new TwoLegged[4];
        bicycleClub[0] = h1;
        bicycleClub[1] = s2;
        bicycleClub[2] = h2;
        bicycleClub[3] = s2;

        System.out.println("Schlumpfhausen:");
        for(Smurf s : schmlumpfhausen){
            System.out.println(s.getName());
        }

        System.out.println("Hannover:");
        for(Human h : hannover){
            System.out.println(h.getName());
        }

        System.out.println("Bycycle Club:");
        for(TwoLegged b : bicycleClub){
            System.out.println(b.getName());
        }


    }
}
