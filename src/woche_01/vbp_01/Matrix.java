package woche_01.vbp_01;

public class Matrix {
    public static double[][] multiply(double[][] matrix_1, double[][] matrix_2) {
        int rows_1 = matrix_1.length;
        int cols_1 = matrix_1[0].length;
        int rows_2 = matrix_2.length;
        int cols_2 = matrix_2[0].length;

        if (cols_1 != rows_2) {
            return null;
        }

        double[][] result = new double[rows_1][cols_2];

        for (int i = 0; i < rows_1; i++) {
            for (int j = 0; j < cols_2; j++) {
                for (int k = 0; k < cols_1; k++) {
                    result[i][j] += matrix_1[i][k] * matrix_2[k][j];
                }
            }
        }

        return result;
    }
}