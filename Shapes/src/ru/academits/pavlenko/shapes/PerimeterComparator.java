package ru.academits.pavlenko.shapes;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return (int) (o2.getPerimeter() - o1.getPerimeter());
    }
}