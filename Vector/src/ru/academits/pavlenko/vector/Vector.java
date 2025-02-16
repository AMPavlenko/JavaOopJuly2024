package ru.academits.pavlenko.vector;

import java.util.Arrays;

import static java.lang.Math.max;

public class Vector {
    private int n;
    private double[] vectorComponents;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }

        this.n = n;
        vectorComponents = new double[n];
    }

    public Vector(Vector vector) {
        this.n = vector.n;
        this.vectorComponents = vector.vectorComponents;
    }

    public Vector(double[] vectorComponents) {
        this.n = vectorComponents.length;
        this.vectorComponents = new double[n];

        for (int i = 0; i < n; i++) {
            this.vectorComponents[i] = vectorComponents[i];
        }
    }

    public Vector(int n, double[] vectorComponents) {
        if (n <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }

        this.n = n;
        this.vectorComponents = new double[n];

        for (int i = 0; i < vectorComponents.length; i++) {
            this.vectorComponents[i] = vectorComponents[i];
        }
    }

    public int getSize() {
        return vectorComponents.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{').append(Arrays.toString(vectorComponents)).append('}');
        stringBuilder.deleteCharAt(1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 2);

        return stringBuilder.toString();
    }

    public Vector addition(Vector vector) {
        int maxVectorDimension = max(this.n, vector.n);
        Vector thisVector = new Vector(maxVectorDimension, this.vectorComponents);
        Vector addVector = new Vector(maxVectorDimension, vector.vectorComponents);

        double[] additionResult = new double[maxVectorDimension];
        for (int i = 0; i < maxVectorDimension; i++) {
            additionResult[i] = thisVector.vectorComponents[i] + addVector.vectorComponents[i];
        }

        return new Vector(maxVectorDimension, additionResult);
    }

    public Vector subtraction(Vector vector) {
        int maxVectorDimension = max(this.n, vector.n);
        Vector thisVector = new Vector(maxVectorDimension, this.vectorComponents);
        Vector addVector = new Vector(maxVectorDimension, vector.vectorComponents);

        double[] subtractionResult = new double[maxVectorDimension];
        for (int i = 0; i < maxVectorDimension; i++) {
            subtractionResult[i] = thisVector.vectorComponents[i] - addVector.vectorComponents[i];
        }

        return new Vector(maxVectorDimension, subtractionResult);
    }

    public Vector scalarVectorMultiplication(double scalar) {
        double[] multiplicationResult = new double[this.n];

        for (int i = 0; i < this.n; i++) {
            multiplicationResult[i] = scalar * this.vectorComponents[i];
        }

        return new Vector(this.n, multiplicationResult);
    }

    public Vector vectorReversal() {
        double[] reversalResult = new double[this.n];

        for (int i = 0; i < this.n; i++) {
            reversalResult[i] = -1 * this.vectorComponents[i];
        }

        return new Vector(this.n, reversalResult);
    }

    public double getLength() {
        double sum = 0;

        for (double vectorComponent : this.vectorComponents) {
            sum += vectorComponent * vectorComponent;
        }

        return Math.sqrt(sum);
    }

    public double getVectorComponent(int index) {
        if (index < 0 || index >= this.n) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        return this.vectorComponents[index];
    }

    public void setVectorComponent(int index, double component) {
        if (index < 0 || index >= this.n) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        this.vectorComponents[index] = component;
    }
}