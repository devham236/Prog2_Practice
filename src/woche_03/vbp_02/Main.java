package woche_03.vbp_02;

public class Main {
    public static void main(String[] args) {
        Log log = new Log();

        log.setPriority(2).log("Netzwerk", "Verbindung hergestellt");
        System.out.println(log.getLastMessage());

        log.setPriority(1).log("Update verfügbar");
        System.out.println(log.getLastMessage());
    }
}
