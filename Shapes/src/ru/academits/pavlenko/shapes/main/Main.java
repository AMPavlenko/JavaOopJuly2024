package ru.academits.pavlenko.shapes.main;

import ru.academits.pavlenko.shapes.*;
import ru.academits.pavlenko.shapes.comparators.ShapeAreaComparator;
import ru.academits.pavlenko.shapes.comparators.ShapePerimeterComparator;
import ru.academits.pavlenko.shapes.shapes.Circle;
import ru.academits.pavlenko.shapes.shapes.Rectangle;
import ru.academits.pavlenko.shapes.shapes.Square;
import ru.academits.pavlenko.shapes.shapes.Triangle;

import java.util.Arrays;

public class Main {
    public static void printShapeInfo(Shape shape) {
        System.out.printf("Фигура %s. ширина - %f, высота - %f, площадь - %f, периметр - %f.%n",
                shape, shape.getWidth(), shape.getHeight(), shape.getArea(), shape.getPerimeter());
    }

    public static void main(String[] args) {
        // Тестовый набор фигур
        Square square1 = new Square(30);
        Square square2 = new Square(20);

        Triangle triangle1 = new Triangle(0, 0, 0, 1, 1, 0);
        Triangle triangle2 = new Triangle(0, 0, 0, 1, 1, 0);

        Rectangle rectangle1 = new Rectangle(20, 20);
        Rectangle rectangle2 = new Rectangle(20, 20);

        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(20);

        // Создание массива фигур
        Shape[] shapes = {square1, square2, triangle1, triangle2, rectangle1, rectangle2, circle1, circle2};

        for (Shape element : shapes) {
            printShapeInfo(element);
        }

        // Сортировка по площади по убыванию
        Arrays.sort(shapes, new ShapeAreaComparator());
        // Информация о фигуре максимальной площади из массива фигур
        System.out.printf("Фигура с максимальной площадью из массива фигур: %s.%n", shapes[0]);

        // Сортировка по периметру по убыванию
        Arrays.sort(shapes, new ShapePerimeterComparator());
        // Информация о фигуре со вторым по величине периметром из массива фигур
        System.out.printf("Фигура со вторым по величине периметром из массива фигур: %s.%n", shapes[1]);

        // Пример сравнения площадей двух фигур с помощью хэш кода.
        if (square1.hashCode() == square2.hashCode()) {
            System.out.println("Следует сравнить методом equals.");
        } else {
            System.out.println("Не следует сравнивать методом equals, т.к. " +
                    "хэш-код (hashСode) фигур отличается друг от друга. Это означает, что объекты точно не равны.");
        }

        // Пример сравнения фигур по полям с помощью equals
        if (square1.equals(square2)) {
            System.out.println("Фигуры равны.");
        } else {
            System.out.println("Фигуры не равны или объекты принадлежат разным классам.");
        }

        if (triangle1.equals(triangle2)) {
            System.out.println("Фигуры равны.");
        } else {
            System.out.println("Фигуры не равны или объекты принадлежат разным классам.");
        }

        if (rectangle1.equals(rectangle2)) {
            System.out.println("Фигуры равны.");
        } else {
            System.out.println("Фигуры не равны или объекты принадлежат разным классам.");
        }

        if (circle1.equals(circle2)) {
            System.out.println("Фигуры равны.");
        } else {
            System.out.println("Фигуры не равны или объекты принадлежат разным классам.");
        }

        square1.setSideLength(50);
        System.out.printf("Новое значение стороны квадрата равно %f.%n", square1.getSideLength());

        triangle1.setX1(1);
        triangle1.setY1(0);
        triangle1.setX2(20);
        triangle1.setY2(0);
        triangle1.setX3(0);
        triangle1.setY3(50);
        System.out.printf("Новые координаты вершин треугольника {x1 = %f, y1 = %f}, {x2 = %f, y2 = %f}, {x3 = %f," +
                        " y3 = %f}.%n", triangle1.getX1(), triangle1.getY1(), triangle1.getX2(), triangle1.getY2(),
                triangle1.getX3(), triangle1.getY3());

        rectangle1.setSideLength(100);
        rectangle1.setAdjacentSideLength(200);
        System.out.printf("Новое значение высоты и ширины прямоугольника равны %f и %f соответственно.%n",
                rectangle1.getSideLength(), rectangle1.getAdjacentSideLength());

        circle1.setRadius(1000);
        System.out.printf("Новое значение радиуса окружности равно %f.%n", circle1.getRadius());
    }
}