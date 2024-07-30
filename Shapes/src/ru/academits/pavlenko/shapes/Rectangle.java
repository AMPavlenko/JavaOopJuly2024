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

    @Override
    public String toString() {
        return "прямоугольник площадью " + getArea() + " и периметром " + getPerimeter();
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
        return getArea() == p.getArea();
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(getArea());
        return hash;
    }
}