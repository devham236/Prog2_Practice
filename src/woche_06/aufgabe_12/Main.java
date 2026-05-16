package woche_06.aufgabe_12;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"man i need", "think fast"};
        Playlist playlist = new Playlist("bangers", arr);

        String[] arr_2 = {"man i need", "think fast"};
        Playlist playlist_2 = new Playlist("bangers", arr_2);

        Playlist copy = new Playlist(playlist);

        System.out.println("Playlist 1 gleich Playlist 2? " + playlist.equals(playlist_2));
        System.out.println("Playlist 1 gleich Kopie? " + playlist.equals(copy));

        System.out.printf("playlist 1 hashcode: %d \n", playlist.hashCode());
        System.out.printf("playlist 2 hashcode: %d \n", playlist_2.hashCode());
        System.out.printf("copy hashcode:       %d \n", copy.hashCode());

        arr[0] = "geändert";
        System.out.println("Nach Änderung des Ur-Arrays - Gleich? " + playlist.equals(copy));
    }
}
