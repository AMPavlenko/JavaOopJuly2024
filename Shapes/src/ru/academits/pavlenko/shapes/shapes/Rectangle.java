package ru.academits.pavlenko.shapes.shapes;

import ru.academits.pavlenko.shapes.Shape;

public class Rectangle implements Shape {
    private double rectangleHeight;
    private double rectangleWidth;

    public Rectangle(double rectangleWidth, double rectangleHeight) {
        this.rectangleHeight = rectangleHeight;
        this.rectangleWidth = rectangleWidth;
    }

    public double getRectangleHeight() {
        return rectangleHeight;
    }

    public void setRectangleHeight(double rectangleHeight) {
        this.rectangleHeight = rectangleHeight;
    }

    public double getRectangleWidth() {
        return rectangleWidth;
    }

    public void setRectangleWidth(double rectangleWidth) {
        this.rectangleWidth = rectangleWidth;
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