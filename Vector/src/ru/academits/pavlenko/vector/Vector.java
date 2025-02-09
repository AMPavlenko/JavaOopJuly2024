package ru.academits.pavlenko.vector;

public class Vector {
    private int n;
    private double[] vector;

    public Vector(int n) {
        this.n = n;
        vector = new double[n];
    }

    public Vector(Vector vector) {
        this.n = vector.n;
        this.vector = vector.vector;
    }

    public int getSize() {
        return vector.length;
    }
}
  /*  private double[] components;
    private int n;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }

        this.n = n;
        components = new double[n];
    }

    public Vector(Vector v) {
        size = v.size;
        components = v.components.clone();
    }

    public Vector(double[] arr) {
        size = arr.length;
        components = arr.clone();
    }

    public Vector(int n, double[] arr) {
        if (n <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }
        size = n;
        components = new double[n];
        System.arraycopy(arr, 0, components, 0, Math.min(arr.length, n));
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < size; i++) {
            sb.append(components[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public Vector add(Vector v) {
        if (size != v.size) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = components[i] + v.components[i];
        }
        return new Vector(size, result);
    }

    public Vector subtract(Vector v) {
        if (size != v.size) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = components[i] - v.components[i];
        }
        return new Vector(size, result);
    }

    public Vector multiply(double scalar) {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = components[i] * scalar;
        }
        return new Vector(size, result);
    }

    public Vector negate() {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = -components[i];
        }
        return new Vector(size, result);
    }

    public double length() {
        double sum = 0;
        for (double component : components) {
            sum += component * component;
        }
        return Math.sqrt(sum);
    }

    public double getComponent(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return components[index];
    }

    public void setComponent(int index, double value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        components[index] = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vector v = (Vector) obj;
        if (size != v.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (Double.compare(v.components[i], components[i]) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (double component : components) {
            long temp = Double.doubleToLongBits(component);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
        }
        return result;
    }

    public static Vector add(Vector v1, Vector v2) {
        if (v1.size != v2.size) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        double[] result = new double[v1.size];
        for (int i = 0; i < v1.size; i++) {
            result[i] = v1.components[i] + v2.components[i];
        }
        return new Vector(v1.size, result);
    }

    public static Vector subtract(Vector v1, Vector v2) {
        if (v1.size != v2.size) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        double[] result = new double[v1.size];
        for (int i = 0; i < v1.size; i++) {
            result[i] = v1.components[i] - v2.components[i];
        }
        return new Vector(v1.size, result);
    }

    public static double dotProduct(Vector v1, Vector v2) {
        if (v1.size != v2.size) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        double sum = 0;
        for (int i = 0; i < v1.size; i++) {
            sum += v1.components[i] * v2.components[i];
        }
        return sum;
    }
    */
/*}


/*
package ru.academits.pavlenko.vector;

public class Vector {
    private double[] components;
    private int size;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }

        size = n;
        components = new double[n];
    }

    public Vector(Vector v) {
        size = v.size;
        components = v.components.clone();
    }

    public Vector(double[] arr) {
        size = arr.length;
        components = arr.clone();
    }

    public Vector(int n, double[] arr) {
        if (n <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }
        size = n;
        components = new double[n];
        System.arraycopy(arr, 0, components, 0, Math.min(arr.length, n));
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < size; i++) {
            sb.append(components[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public Vector add(Vector v) {
        if (size != v.size) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = components[i] + v.components[i];
        }
        return new Vector(size, result);
    }

    public Vector subtract(Vector v) {
        if (size != v.size) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = components[i] - v.components[i];
        }
        return new Vector(size, result);
    }

    public Vector multiply(double scalar) {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = components[i] * scalar;
        }
        return new Vector(size, result);
    }

    public Vector negate() {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = -components[i];
        }
        return new Vector(size, result);
    }

    public double length() {
        double sum = 0;
        for (double component : components) {
            sum += component * component;
        }
        return Math.sqrt(sum);
    }

    public double getComponent(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return components[index];
    }

    public void setComponent(int index, double value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        components[index] = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vector v = (Vector) obj;
        if (size != v.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (Double.compare(v.components[i], components[i]) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (double component : components) {
            long temp = Double.doubleToLongBits(component);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
        }
        return result;
    }

    public static Vector add(Vector v1, Vector v2) {
        if (v1.size != v2.size) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        double[] result = new double[v1.size];
        for (int i = 0; i < v1.size; i++) {
            result[i] = v1.components[i] + v2.components[i];
        }
        return new Vector(v1.size, result);
    }

    public static Vector subtract(Vector v1, Vector v2) {
        if (v1.size != v2.size) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        double[] result = new double[v1.size];
        for (int i = 0; i < v1.size; i++) {
            result[i] = v1.components[i] - v2.components[i];
        }
        return new Vector(v1.size, result);
    }

    public static double dotProduct(Vector v1, Vector v2) {
        if (v1.size != v2.size) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        double sum = 0;
        for (int i = 0; i < v1.size; i++) {
            sum += v1.components[i] * v2.components[i];
        }
        return sum;
    }
}

 */