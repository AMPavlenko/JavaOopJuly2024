package ru.academits.pavlenko.shapes.comparator;

import ru.academits.pavlenko.shapes.Shape;

import java.util.Comparator;

public class AreasComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return (int) (o2.getArea() - o1.getArea());
    }
}