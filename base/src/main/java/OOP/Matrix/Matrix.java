package OOP.Matrix;

public class Matrix {
    final private double[][] numbers;
    final private int line_col;
    final private int column_col;
    public Matrix(int line_col, int column_col){
        this.line_col = line_col;
        this.column_col = column_col;
        this.numbers = new double[line_col][column_col];
    }
    public double getValue(int line, int column){
        return numbers[line][column];
    }
    public void setValue(int line, int column, double value){
        this.numbers[line][column] = value;
    }

    public void sumMatrix(Matrix matrix1, Matrix matrix2){
        if ((matrix1.line_col != matrix2.line_col) || (matrix1.column_col != matrix2.column_col)){
            System.out.println("Матрицы нельзя сложить");

        } else {
            for (int line = 0; line < line_col; line++) {
                for (int column = 0; column < column_col; column++) {
                    setValue(line, column, matrix1.getValue(line, column) + matrix2.getValue(line, column));
                }
            }
        }
    }
    public void printMatrix(){
        for (int line = 0; line < line_col; line++) {
            for (int column = 0; column < column_col; column++) {
                System.out.print(getValue(line, column) + " ");
            }
            System.out.println();
        }
    }

    public void numPerMatrix(int scalar){
        for (int line = 0; line < line_col; line++){
            for (int column = 0; column < column_col; column++) {
                numbers[line][column] *= scalar;
            }
        }
    }

    public Matrix matrixPerMatrix(Matrix matrix1, Matrix matrix2){
        if (matrix1.column_col != matrix2.line_col){
            System.out.println("Матрицы нельзя перемножить");
            return new Matrix(0,0);
        }else{
            Matrix matrix3 = new Matrix(matrix1.line_col, matrix2.column_col);
            for (int line = 0; line < matrix3.line_col; line++) {
                for (int column = 0; column < matrix3.column_col; column++) {
                    for (int line_multi = 0; line_multi < matrix1.column_col; line_multi++) {
                        matrix3.setValue(line, column, matrix3.getValue(line, column) + matrix1.getValue(line, line_multi) * matrix2.getValue(line_multi, column));
                    }
                }
            }
            return matrix3;
        }
    }
}
