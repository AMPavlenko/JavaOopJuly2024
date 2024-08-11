package ru.academits.pavlenko.shapes.comparator;

import ru.academits.pavlenko.shapes.Shape;

import java.util.Comparator;

public class PerimetersComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return (int) (o2.getPerimeter() - o1.getPerimeter());
    }
}