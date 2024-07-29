package ru.academits.pavlenko.shapes;

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
}