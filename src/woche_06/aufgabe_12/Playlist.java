package woche_06.aufgabe_12;

public class Playlist {
    private String name;
    private String[] songs;

    public Playlist(String n, String[] s){
        this.name = n;
        this.songs = s;
    }

    public Playlist(Playlist p){
        this.name = p.name;
        this.songs = new String[p.songs.length];
        for (int i = 0; i < p.songs.length; i++) {
            this.songs[i] = p.songs[i];
        }
    }

    public boolean equals(Object obj){
        if (obj instanceof Playlist) {
            Playlist other = (Playlist) obj;

            if (!this.name.equals(other.name)) {
                return false;
            }

            if (this.songs.length == other.songs.length) {
                for (int i = 0; i < this.songs.length; i++) {
                    if (!this.songs[i].equals(other.songs[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int code = 0;
        for (int i = 0, j = 1; i < this.songs.length; i++, j++) {
            code += this.songs[i].hashCode() * Math.pow(31, this.songs.length - j);
        }
        return code;
    }
}
