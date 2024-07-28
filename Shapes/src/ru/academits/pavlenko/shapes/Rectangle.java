package ru.academits.pavlenko.shapes;

public class Rectangle implements Shape {
    private final double rectangleHeight;
    private final double rectangleWidth;

    public Rectangle(double rectangleHeight, double rectangleWidth) {
        this.rectangleHeight = rectangleHeight;
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
}