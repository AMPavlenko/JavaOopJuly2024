package ru.academits.pavlenko.shapes.main;

import ru.academits.pavlenko.shapes.Circle;
import ru.academits.pavlenko.shapes.Rectangle;
import ru.academits.pavlenko.shapes.Square;
import ru.academits.pavlenko.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10);
        Triangle triangle = new Triangle(0, 0, 0, 1, 1, 0);
        Rectangle rectangle = new Rectangle(100, 200);
        Circle circle = new Circle(1);

        System.out.printf("Ширина квадрата - %f, высота квадрата - %f, площадь квадрата - %f, периметр квадрата - %f.%n",
                square.getWidth(), square.getHeight(), square.getArea(), square.getPerimeter());
        System.out.printf("Ширина треугольника - %f, высота треугольника - %f, площадь треугольника - %f, периметр " +
                        "треугольника - %f.%n", triangle.getWidth(), triangle.getHeight(), triangle.getArea(),
                triangle.getPerimeter());
        System.out.printf("Ширина прямоугольника - %f, высота прямоугольника - %f, площадь прямоугольника - %f, " +
                        "периметр прямоугольника - %f.%n", rectangle.getWidth(), rectangle.getHeight(), rectangle.getArea(),
                rectangle.getPerimeter());
        System.out.printf("Ширина окружности - %f, высота окружности - %f, площадь внутри окружности - %f, " +
                        "периметр окружности - %f.%n", circle.getWidth(), circle.getHeight(), circle.getArea(),
                circle.getPerimeter());
    }
}