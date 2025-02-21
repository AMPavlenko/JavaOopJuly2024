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
}
