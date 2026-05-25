package klausur_vorbereitung;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hamza ist ");

        System.out.printf("%s \n", sb);

        sb.append("cool \n");

        System.out.println(sb);

        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
