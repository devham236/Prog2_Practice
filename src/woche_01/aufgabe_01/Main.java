package woche_01.aufgabe_01;

public class Main {
    public static void main(String[] args) {
        double[][] a = {
                {1.0, 3.0},
                {5.0, 7.0}
        };

        double[][] b = {
                {2.0, 4.0},
                {6.0, 8.0}
        };

        double[][] result = Matrix.multiply(a, b);

        if (result != null) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Multiplikation nicht möglich.");
        }
    }
}
