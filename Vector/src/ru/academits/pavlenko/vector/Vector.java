package ru.academits.pavlenko.vector;

import java.util.Arrays;

public class Vector {
    private double[] vectorComponents;

    public Vector(int size) {

        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }

        vectorComponents = new double[size];
    }

    public Vector(Vector vector) {
        this.vectorComponents = vector.vectorComponents;
    }

    public Vector(double[] vectorComponents) {
        this.vectorComponents = new double[vectorComponents.length];

        for (int i = 0; i < vectorComponents.length; i++) {
            this.vectorComponents[i] = vectorComponents[i];
        }
    }

    public Vector(int size, double[] vectorComponents) {

        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }

        this.vectorComponents = new double[size];

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

    public Vector getAddition(Vector vector) {
        int maxVectorDimension = Math.max(this.vectorComponents.length, vector.vectorComponents.length);
        Vector thisVector = new Vector(maxVectorDimension, this.vectorComponents);
        Vector addVector = new Vector(maxVectorDimension, vector.vectorComponents);

        double[] additionResult = new double[maxVectorDimension];

        for (int i = 0; i < maxVectorDimension; i++) {
            additionResult[i] = thisVector.vectorComponents[i] + addVector.vectorComponents[i];
        }

        return new Vector(maxVectorDimension, additionResult);
    }

    public Vector getSubtraction(Vector vector) {
        int maxVectorDimension = Math.max(this.vectorComponents.length, vector.vectorComponents.length);
        Vector thisVector = new Vector(maxVectorDimension, this.vectorComponents);
        Vector addVector = new Vector(maxVectorDimension, vector.vectorComponents);

        double[] subtractionResult = new double[maxVectorDimension];

        for (int i = 0; i < maxVectorDimension; i++) {
            subtractionResult[i] = thisVector.vectorComponents[i] - addVector.vectorComponents[i];
        }

        return new Vector(maxVectorDimension, subtractionResult);
    }

    public Vector getScalarVectorMultiplication(double scalar) {
        double[] multiplicationResult = new double[vectorComponents.length];

        for (int i = 0; i < vectorComponents.length; i++) {
            multiplicationResult[i] = scalar * vectorComponents[i];
        }

        return new Vector(vectorComponents.length, multiplicationResult);
    }

    public Vector getVectorReversal() {
        double[] reversalResult = new double[vectorComponents.length];

        for (int i = 0; i < vectorComponents.length; i++) {
            reversalResult[i] = -vectorComponents[i];
        }

        return new Vector(vectorComponents.length, reversalResult);
    }

    public double getLength() {
        double sum = 0;

        for (double vectorComponent : vectorComponents) {
            sum += vectorComponent * vectorComponent;
        }

        return Math.sqrt(sum);
    }

    public double getVectorComponent(int index) {

        if (index < 0 || index >= vectorComponents.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        return vectorComponents[index];
    }

    public void setVectorComponent(int index, double component) {

        if (index < 0 || index >= vectorComponents.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        vectorComponents[index] = component;
    }

    @Override
    public boolean equals(Object object) {

        if (object == this) {
            return true;
        }

        if (object == null || object.getClass() != getClass()) {
            return false;
        }

        Vector vector = (Vector) object;

        if (this.vectorComponents.length != vector.vectorComponents.length) {
            return false;
        }

        for (int i = 0; i < this.vectorComponents.length; i++) {

            if (this.vectorComponents[i] != vector.vectorComponents[i]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Arrays.hashCode(vectorComponents);

        return hash;
    }

    public static Vector getAddition(Vector vector1, Vector vector2) {
        int maxVectorDimension = Math.max(vector1.vectorComponents.length, vector2.vectorComponents.length);
        Vector givenDimensionVector1 = new Vector(maxVectorDimension, vector1.vectorComponents);
        Vector givenDimensionVector2 = new Vector(maxVectorDimension, vector2.vectorComponents);

        double[] additionResult = new double[maxVectorDimension];

        for (int i = 0; i < maxVectorDimension; i++) {
            additionResult[i] = givenDimensionVector1.vectorComponents[i] + givenDimensionVector2.vectorComponents[i];
        }

        return new Vector(maxVectorDimension, additionResult);
    }

    public static Vector getSubtraction(Vector vector1, Vector vector2) {
        int maxVectorDimension = Math.max(vector1.vectorComponents.length, vector2.vectorComponents.length);
        Vector givenDimensionVector1 = new Vector(maxVectorDimension, vector1.vectorComponents);
        Vector givenDimensionVector2 = new Vector(maxVectorDimension, vector2.vectorComponents);

        double[] subtractionResult = new double[maxVectorDimension];

        for (int i = 0; i < maxVectorDimension; i++) {
            subtractionResult[i] = givenDimensionVector1.vectorComponents[i] - givenDimensionVector2.vectorComponents[i];
        }

        return new Vector(maxVectorDimension, subtractionResult);
    }

    public static double getScalarMultiplication(Vector vector1, Vector vector2) {
        int maxVectorDimension = Math.max(vector1.vectorComponents.length, vector2.vectorComponents.length);
        Vector givenDimensionVector1 = new Vector(maxVectorDimension, vector1.vectorComponents);
        Vector givenDimensionVector2 = new Vector(maxVectorDimension, vector2.vectorComponents);

        double sum = 0;

        for (int i = 0; i < maxVectorDimension; i++) {
            sum += givenDimensionVector1.vectorComponents[i] * givenDimensionVector2.vectorComponents[i];
        }

        return sum;
    }
}