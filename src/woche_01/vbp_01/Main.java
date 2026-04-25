package woche_01.vbp_01;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        int[][] m1_data = {{1, 3},
                           {5, 7}};
        m1.setData(m1_data);

        Matrix m2 = new Matrix(2, 2);
        int[][] m2_data = {{2, 4},
                           {6, 8}};
        m2.setData(m2_data);

        Matrix result = m1.multiply(m2);

        if (result != null) {
            result.print();
        } else {
            System.out.println("Multiplikation nicht möglich.");
        }
    }
}
