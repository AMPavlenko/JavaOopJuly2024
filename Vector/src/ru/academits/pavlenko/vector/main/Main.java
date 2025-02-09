package ru.academits.pavlenko.vector.main;

import ru.academits.pavlenko.vector.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(3);
        Vector vector1 = new Vector(vector);
        System.out.printf("%d%n", vector.getSize());
        System.out.printf("%d", vector1.getSize());
    }
}