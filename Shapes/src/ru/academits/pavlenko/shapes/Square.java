package ru.academits.pavlenko.shapes;

public class Square implements Shape {
    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getWidth() {
        return sideLength;
    }

    @Override
    public double getHeight() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
        return sideLength + sideLength + sideLength + sideLength;
    }

    @Override
    public String toString() {
        return "квадрат площадью " + getArea() + " и периметром " + getPerimeter();
    }

    @Override
    public boolean equals(Object shape) {
        if (shape == this) {
            return true;
        }

        if (shape == null || shape.getClass() != getClass()) {
            return false;
        }

        Square p = (Square) shape;
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