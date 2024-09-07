package ru.academits.pavlenko.shapes.shapes;

import ru.academits.pavlenko.shapes.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getWidth() {
        return radius + radius;
    }

    @Override
    public double getHeight() {
        return radius + radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Окружность. Радиус: " + radius;
    }

    @Override
    public boolean equals(Object object1) {
        if (object1 == this) {
            return true;
        }

        if (object1 == null || object1.getClass() != getClass()) {
            return false;
        }

        Circle object2 = (Circle) object1;
        return radius == object2.radius;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(radius);
        return hash;
    }
}