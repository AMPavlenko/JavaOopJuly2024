package ru.academits.pavlenko.shapes.shapes;

import ru.academits.pavlenko.shapes.Shape;

public class Rectangle implements Shape {
    private final double rectangleHeight;
    private final double rectangleWidth;

    public Rectangle(double rectangleWidth, double rectangleHeight) {
        this.rectangleWidth = rectangleWidth;
        this.rectangleHeight = rectangleHeight;
    }

    @Override
    public double getWidth() {
        return rectangleWidth;
    }

    @Override
    public double getHeight() {
        return rectangleHeight;
    }

    @Override
    public double getArea() {
        return rectangleHeight * rectangleWidth;
    }

    @Override
    public double getPerimeter() {
        return rectangleHeight + rectangleHeight + rectangleWidth + rectangleWidth;
    }

    @Override
    public String toString() {
        return "Прямоугольник. Высота и ширина: " + rectangleHeight + " и " + rectangleWidth;
    }

    @Override
    public boolean equals(Object shape) {
        if (shape == this) {
            return true;
        }

        if (shape == null || shape.getClass() != getClass()) {
            return false;
        }

        Rectangle p = (Rectangle) shape;
        return rectangleHeight == p.rectangleHeight && rectangleWidth == p.rectangleWidth;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(rectangleHeight);
        hash = prime * hash + Double.hashCode(rectangleWidth);
        return hash;
    }
}