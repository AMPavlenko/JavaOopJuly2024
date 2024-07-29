package ru.academits.pavlenko.shapes.main;

import ru.academits.pavlenko.shapes.*;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(10);
        Square square2 = new Square(20);

        Triangle triangle1 = new Triangle(0, 0, 0, 1, 1, 0);
        Triangle triangle2 = new Triangle(10, 0, 20, 10, 30, 100);

        Rectangle rectangle1 = new Rectangle(100, 200);
        Rectangle rectangle2 = new Rectangle(20, 30);

        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(30);

        System.out.printf("Первый квадрат: ширина - %f, высота - %f, площадь - %f, периметр - %f.%n",
                square1.getWidth(), square1.getHeight(), square1.getArea(), square1.getPerimeter());
        System.out.printf("Второй квадрат: ширина - %f, высота - %f, площадь - %f, периметр - %f.%n",
                square2.getWidth(), square2.getHeight(), square2.getArea(), square2.getPerimeter());
        System.out.printf("Первый треугольник: ширина - %f, высота - %f, площадь - %f, периметр - %f.%n",
                triangle1.getWidth(), triangle1.getHeight(), triangle1.getArea(), triangle1.getPerimeter());
        System.out.printf("Второй треугольник: ширина - %f, высота - %f, площадь - %f, периметр - %f.%n",
                triangle2.getWidth(), triangle2.getHeight(), triangle2.getArea(), triangle2.getPerimeter());
        System.out.printf("Первый прямоугольник: ширина - %f, высота  - %f, площадь  - %f, периметр - %f.%n",
                rectangle1.getWidth(), rectangle1.getHeight(), rectangle1.getArea(), rectangle1.getPerimeter());
        System.out.printf("Второй прямоугольник: ширина - %f, высота  - %f, площадь  - %f, периметр - %f.%n",
                rectangle2.getWidth(), rectangle2.getHeight(), rectangle2.getArea(), rectangle2.getPerimeter());
        System.out.printf("Первая окружность: ширина - %f, высота - %f, площадь - %f, периметр - %f.%n",
                circle1.getWidth(), circle1.getHeight(), circle1.getArea(), circle1.getPerimeter());
        System.out.printf("Вторая окружность: ширина - %f, высота - %f, площадь - %f, периметр - %f.%n",
                circle2.getWidth(), circle2.getHeight(), circle2.getArea(), circle2.getPerimeter());

        Shape[] shapes = new Shape[]{square1, square2, triangle1, triangle2, rectangle1, rectangle2, circle1, circle2};
    }
}