package OOP.Matrix;

public class CheckMatrix {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(2,3);
        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                matrix1.setValue(line, column, line + column);
            }
        }
        for (int line = 0; line < 2; line++) {
            for (int column = 0; column < 3; column++) {
                matrix2.setValue(line, column, 4 - line - column);
            }
        }
        matrix1.printMatrix();
        matrix2.printMatrix();
        matrix1.sumMatrix(matrix1, matrix2);
        matrix1.printMatrix();
        matrix1.numPerMatrix(10);
        matrix1.printMatrix();
        matrix1.matrixPerMatrix(matrix1, matrix2).printMatrix();
    }
}
