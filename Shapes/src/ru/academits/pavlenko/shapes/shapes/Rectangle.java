package ru.academits.pavlenko.shapes.shapes;

import ru.academits.pavlenko.shapes.Shape;

public class Rectangle implements Shape {
    private double height;
    private double width;

    private static final int semiPerimeterSidesCount = 2;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getSideLength() {
        return height;
    }

    public void setSideLength(double height) {
        this.height = height;
    }

    public double getAdjacentSideLength() {
        return width;
    }

    public void setAdjacentSideLength(double width) {
        this.width = width;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return semiPerimeterSidesCount * (height + width);
    }

    @Override
    public String toString() {
        return "Прямоугольник. Высота и ширина: " + height + " и " + width;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (object == null || object.getClass() != getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) object;
        return height == rectangle.height && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(height);
        hash = prime * hash + Double.hashCode(width);
        return hash;
    }
}