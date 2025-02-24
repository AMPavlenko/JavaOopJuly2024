package ru.academits.java.pavlenko.matrix;

import ru.academits.pavlenko.vector.Vector;

public class Matrix {
    private int n;
    private int m;
    private Vector[] rows;

    public Matrix(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException("Matrix dimensions must be positive");
        }

        this.n = n;
        this.m = m;
        this.rows = new Vector[n];

        for (int i = 0; i < n; i++) {
            this.rows[i] = new Vector(m);
        }
    }

    public Matrix(Matrix matrix) {
        this.n = matrix.n;
        this.m = matrix.m;
        this.rows = new Vector[n];

        for (int i = 0; i < n; i++) {
            this.rows[i] = new Vector(matrix.rows[i]);
        }
    }

    public Matrix(double[][] matrixComponents) {
        if (matrixComponents.length == 0 || matrixComponents[0].length == 0) {
            throw new IllegalArgumentException("Matrix dimensions must be positive");
        }

        this.n = matrixComponents.length;
        this.m = matrixComponents[0].length;
        this.rows = new Vector[n];

        for (int i = 0; i < n; i++) {
            this.rows[i] = new Vector(matrixComponents[i]);
        }
    }

    public Matrix(Vector[] vectors) {
        if (vectors.length == 0 || vectors[0].getSize() == 0) {
            throw new IllegalArgumentException("Matrix dimensions must be positive");
        }

        this.n = vectors.length;
        this.m = vectors[0].getSize();
        this.rows = new Vector[n];

        for (int i = 0; i < n; i++) {
            if (vectors[i].getSize() != m) {
                throw new IllegalArgumentException("All rows must have the same size");
            }

            this.rows[i] = new Vector(vectors[i]);
        }
    }

    public int[] getSize() {
        return new int[]{this.n, this.m};
    }

    public Vector getRow(int index) {
        if (index < 0 || index >= this.n) {
            throw new IndexOutOfBoundsException("Row index is out of bounds");
        }

        return new Vector(this.rows[index]);
    }

    public void setRow(int index, Vector vector) {
        if (index < 0 || index >= this.n) {
            throw new IndexOutOfBoundsException("Row index is out of bounds");
        }

        if (vector.getSize() != m) {
            throw new IllegalArgumentException("Row size must match matrix column size");
        }

        rows[index] = new Vector(vector);
    }

    public Vector getColumn(int index) {
        if (index < 0 || index >= m) {
            throw new IndexOutOfBoundsException("Column index is out of bounds");
        }

        double[] columnVector = new double[n];

        for (int i = 0; i < n; i++) {
            columnVector[i] = rows[i].getVectorComponent(index);
        }

        return new Vector(columnVector);
    }

    public Matrix matrixTranspose() {
        Matrix transposedMatrix = new Matrix(m, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedMatrix.rows[j].setVectorComponent(i, rows[i].getVectorComponent(j));
            }
        }

        return transposedMatrix;
    }

    public Matrix scalarMatrixMultiplication(double scalar) {
        Matrix multiplicationResult = new Matrix(n, m);

        for (int i = 0; i < n; i++) {
            multiplicationResult.rows[i] = rows[i].scalarVectorMultiplication(scalar);
        }

        return multiplicationResult;
    }

    public double determinant() {
        if (this.n != this.m) {
            throw new UnsupportedOperationException("Детерминант может быть посчитан только для квадратной матрицы.");
        }

        return determinantHelper(this.rows);
    }

    private double determinantHelper(Vector[] rows) {

        if (rows.length == 2) {
            return rows[0].getVectorComponent(0) * rows[1].getVectorComponent(1) -
                    rows[0].getVectorComponent(1) * rows[1].getVectorComponent(0);
        }

        double det = 0;

        for (int i = 0; i < rows[0].getSize(); i++) {
            det += (i % 2 == 0 ? 1 : -1) * rows[0].getVectorComponent(i) *
                    determinantHelper(getMinor(rows, 0, i));
        }

        return det;
    }

    private Vector[] getMinor(Vector[] rows, int row, int col) {
        Vector[] minor = new Vector[rows.length - 1];

        for (int i = 0; i < rows.length; i++) {
            if (i == row) continue;

            double[] newRow = new double[rows[i].getSize() - 1];

            for (int j = 0; j < rows[i].getSize(); j++) {
                if (j == col) continue;

                newRow[j > col ? j - 1 : j] = rows[i].getVectorComponent(j);
            }

            minor[i > row ? i - 1 : i] = new Vector(newRow);
        }

        return minor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for (int i = 0; i < rows.length; i++) {
            sb.append(rows[i].toString());

            if (i < rows.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("}");
        return sb.toString();
    }
}