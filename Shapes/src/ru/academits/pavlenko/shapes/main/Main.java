package ru.academits.pavlenko.shapes.main;

import ru.academits.pavlenko.shapes.Square;
import ru.academits.pavlenko.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10);
        Triangle triangle = new Triangle(0, 0, 0, 1, 1, 0);

        System.out.printf("Ширина квадрата - %f, длина квадрата - %f, площадь квадрата - %f, периметр квадрата - %f.%n",
                square.getWidth(), square.getHeight(), square.getArea(), square.getPerimeter());
        System.out.printf("Ширина треугольника - %f, длина треугольника - %f, площадь треугольника - %f, периметр " +
                "треугольника - %f.%n", triangle.getWidth(), triangle.getHeight(), triangle.getArea(),
                triangle.getPerimeter());
    }
}