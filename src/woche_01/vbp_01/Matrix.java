package woche_01.vbp_01;

public class Matrix {
    private int rows;
    private int cols;
    private int[][] data;

    public Matrix(int r, int c){
        this.rows = r;
        this.cols = c;
        this.data = new int[r][c];
    }

    public void setData(int[][] values){
        this.data = values;
    }

    public Matrix multiply(Matrix second){

        if (this.rows != second.rows || this.cols != second.cols){
            return null;
        }

        Matrix result = new Matrix(this.rows, second.cols);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < second.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += (this.data[i][k] * second.data[k][j]);
                }
            }
        }

        return result;
    }

    public void print() {
        for (int[] row : data) {
            for (int val : row) {
                System.out.printf("%d ", val);
            }
            System.out.println();
        }
    }
}