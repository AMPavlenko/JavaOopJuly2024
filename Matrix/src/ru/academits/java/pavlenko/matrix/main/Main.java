package ru.academits.java.pavlenko.matrix.main;


import ru.academits.java.pavlenko.matrix.Matrix;
import ru.academits.pavlenko.vector.Vector;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание матрицы нулей размера nxm
        Matrix matrix1 = new Matrix(3, 3);

        // Проверка конструктора копирования
        Matrix matrix2 = new Matrix(matrix1);

        // Проверка конструктора для создания матрицы из двумерного массива
        double[][] range = {{1, 3, 5}, {5, 1, 5}, {3, 3, 2}};
        Matrix matrix3 = new Matrix(range);

        // Проверка конструктора для создания матрицы из массива векторов строк
        Vector[] vectors = {new Vector(new double[]{1, 3, 4}), new Vector(new double[]{3, 3, 8}), new Vector(new double[]{7, 2, 7})};
        Matrix matrix4 = new Matrix(vectors);

        // Проверка метода получения размера матрицы
        System.out.printf("%nРазмер матрицы %s равен = %s.", matrix4, Arrays.toString(matrix4.getSize()));



    }
}