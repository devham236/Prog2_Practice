package woche_03.Enums;

public class LevelManager {
    public static void main(String[] args) {
        for (Level level : Level.values()) {
            System.out.println(level.getValue());
        }
    }
}
