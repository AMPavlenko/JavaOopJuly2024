package ru.academits.pavlenko.shapes.shapes;

import ru.academits.pavlenko.shapes.Shape;

public class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
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
        int sidesCount = 4;
        return sidesCount * sideLength;
    }

    @Override
    public String toString() {
        return "Квадрат. Длина стороны: " + sideLength;
    }

    @Override
    public boolean equals(Object object1) {
        if (object1 == this) {
            return true;
        }

        if (object1 == null || object1.getClass() != getClass()) {
            return false;
        }

        Square object2 = (Square) object1;
        return sideLength == object2.sideLength;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(sideLength);
        return hash;
    }
}