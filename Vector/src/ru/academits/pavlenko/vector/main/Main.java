package ru.academits.pavlenko.vector.main;

import ru.academits.pavlenko.vector.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(3);
        Vector vector1 = new Vector(vector);

        System.out.printf("%d%n", vector.getSize());
        System.out.printf("%d%n", vector1.getSize());

        double[] vector2Components = {1.1, 3, 4.7, 5.4, 7.1};
        Vector vector2 = new Vector(vector2Components);

        System.out.printf("%d%n", vector2.getSize());
        System.out.println(vector2);

        double[] vector3Components = {2, 4, 6, 8, 10};
        Vector vector3 = new Vector(vector3Components);
        double[] vector4Components = {1, -3, -1, 5, 10, 1};
        Vector vector4 = new Vector(vector4Components);

        Vector vector3vector4addition = new Vector(vector3.addition(vector4));
        System.out.println(vector3vector4addition);

        Vector vector3vector4subtraction = new Vector(vector3.subtraction(vector4));
        System.out.println(vector3vector4subtraction);
    }
}