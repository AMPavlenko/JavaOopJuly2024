package ru.academits.pavlenko.vector.main;

import ru.academits.pavlenko.vector.Vector;

public class Main {
    public static void main(String[] args) {
        //Проверка создания вектора размерности n, все компоненты которого равны 0
        Vector vector = new Vector(3);
        //Проверка работы конструктора копирования
        Vector vector1 = new Vector(vector);

        //Проверка работы метода getSize() для получения размерности вектора
        System.out.printf("Размерность вектора %s равна %d.", vector, vector.getSize());
        System.out.printf("%nРазмерность вектора %s равна %d.%n", vector1, vector1.getSize());

        //Проверка работы конструктора Vector(double[]) заполнения вектора значениями из массива
        double[] vector2Components = {1.1, 3, 4.7, 5.4, 7.1};
        Vector vector2 = new Vector(vector2Components);
        System.out.printf("%nЗначения компонент вектора vector2 равны %s.", vector2);

        //Проверка работы конструктора Vector(n, double[]) для заполнения вектора значениями из массива.
        Vector vector3 = new Vector(6, vector2Components);
        System.out.printf("%nЗначения компонент вектора vector3 равны %s.%n", vector3);

        //Проверка работы метода прибавления к вектору другого вектора
        double[] vector4Components = {2, 4, 6, 8, 10, 1};
        Vector vector4 = new Vector(vector4Components);
        double[] vector5Components = {1, -3, -1, 5, 10};
        Vector vector5 = new Vector(vector5Components);

        Vector vector4vector5addition = new Vector(vector4.addition(vector5));
        System.out.printf("%nВектор %s + вектор %s = %s.", vector4, vector5, vector4vector5addition);

        //Проверка работы метода вычитания из вектора другого вектора
        Vector vector4vector5subtraction = new Vector(vector4.subtraction(vector5));
        System.out.printf("%nВектор %s - вектор %s = %s.", vector4, vector5, vector4vector5subtraction);

        //Проверка работы метода умножения вектора на скаляр
        double scalar = 7.8;

        Vector vector6 = new Vector(vector4.scalarVectorMultiplication(scalar));
        System.out.printf("%nСкалярная величина %s * вектор %s = %s.%n", scalar, vector4, vector6);

        //Проверка метода разворота вектора
        Vector vector7 = new Vector(vector4.vectorReversal());
        System.out.printf("%nНачальный вектор %s. Развернутый вектор %s.%n", vector4, vector7);

        //Проверка метода получения длины вектора
        System.out.printf("%nДлина вектора %s равна %s.%n", vector5, vector5.getLength());

        //Проверка получения значения компоненты по индексу
        int index = 2;
        System.out.printf("%nЗначение компоненты вектора %s по индексу %d равно %s.%n", vector5, index,
                vector5.getVectorComponent(index));

        //Проверка установки значения компоненты по индексу
        double component = 10;
        vector5.setVectorComponent(index, component);
        System.out.printf("%nНовое значение компоненты вектора %s по индексу %d равно: %s.%n",
                vector5, index, vector5.getVectorComponent(index));

        System.out.println();

        //Проверка сравнения векторов методом equals
        double[] vector8Components = {2, 4, 6, 8, 10};
        Vector vector8 = new Vector(vector8Components);

        if (vector4.equals(vector8)) {
            System.out.println("Фигуры равны.");
        } else {
            System.out.println("Фигуры не равны или объекты принадлежат разным классам.");
        }

        System.out.println();

        //Проверка сравнения векторов с помощью хэш кода.
        if (vector4.hashCode() == vector8.hashCode()) {
            System.out.println("Хэш коды объектов равны. Следует сравнить методом equals.");
        } else {
            System.out.println("Объекты не равны.");
        }

        //Проверка статического метода сложения векторов
        System.out.printf("%nРезультат сложения векторов %s и %s равен: %s", vector4, vector8,
                Vector.addition(vector4, vector8));

        //Проверка статического метода вычитания векторов
        System.out.printf("%nРезультат вычитания векторов %s и %s равен: %s", vector4, vector8,
                Vector.subtraction(vector4, vector8));

        //Проверка статического метода скалярного произведения векторов
        System.out.printf("%nРезультат скалярного произведения векторов %s и %s равен: %s", vector4, vector8,
                Vector.scalarMultiplication(vector4, vector8));
    }
}