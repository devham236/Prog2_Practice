package woche_01.vbp_01;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 3},
                          {5, 7}};

        int[][] matrix2 = {{2, 4},
                          {6, 8}};

        int[][] test = multiply(matrix1, matrix2);

        if (test != null){
            for (int i = 0; i < test.length; i++) {
                System.out.println();
                for (int j = 0; j < test[i].length; j++) {
                    System.out.printf("%d ", test[i][j]);
                }
            }
        }
        else {
            System.out.println("Matrixmultiplikation nicht möglich");
        }
    }

    public static int[][] multiply(int[][] m1, int[][] m2){
        int rowsM1 = m1.length;
        int rowsM2 = m2.length;
        int colsM1 = m1[0].length;
        int colsM2 = m2[0].length;

        if (rowsM1 != rowsM2 || colsM1 != colsM2){
            return null;
        }

        int[][] product = new int[m1.length][m1[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    product[i][j] += (m1[i][k] * m2[k][j]);
                }
            }
        }

        return product;
    }
}