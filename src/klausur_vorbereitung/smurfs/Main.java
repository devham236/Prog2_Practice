package klausur_vorbereitung.smurfs;

public class Main {
    public static void main(String[] args) {
        Human[] hannover = new Human[2];
        Smurf[] schlumpfhausen = new Smurf[2];
        TwoLegged[] bicycleClub = new TwoLegged[4];

        Human erwin = new Human();
        erwin.setName("Erwin");
        Human sabine = new Human();
        sabine.setName("Sabine");
        hannover[0] = erwin;
        hannover[1] = sabine;

        Smurf SchlaubiSchlumpf = new Smurf();
        SchlaubiSchlumpf.setName("Schlaubischlumpf");
        Smurf Schlumpfine = new Smurf();
        Schlumpfine.setName("Schlumpfine");
        schlumpfhausen[0] = SchlaubiSchlumpf;
        schlumpfhausen[1] = Schlumpfine;

        bicycleClub[0] = erwin;
        bicycleClub[1] = SchlaubiSchlumpf;
        bicycleClub[2] = sabine;
        bicycleClub[3] = Schlumpfine;

        for (int i = 0; i < bicycleClub.length; i++) {
            System.out.println(bicycleClub[i].getName());
        }


    }
}
