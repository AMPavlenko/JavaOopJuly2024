package ru.academits.pavlenko.shapes.shapes;

import ru.academits.pavlenko.shapes.Shape;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getRectangleHeight() {
        return height;
    }

    public void setRectangleHeight(double height) {
        this.height = height;
    }

    public double getRectangleWidth() {
        return width;
    }

    public void setRectangleWidth(double width) {
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
        int semiPerimeterSidesCount = 2;
        return semiPerimeterSidesCount * (height + width);
    }

    @Override
    public String toString() {
        return "Прямоугольник. Высота и ширина: " + height + " и " + width;
    }

    @Override
    public boolean equals(Object object1) {
        if (object1 == this) {
            return true;
        }

        if (object1 == null || object1.getClass() != getClass()) {
            return false;
        }

        Rectangle object2 = (Rectangle) object1;
        return height == object2.height && width == object2.width;
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