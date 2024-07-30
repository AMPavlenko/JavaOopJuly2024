package ru.academits.pavlenko.shapes;

public class Triangle implements Shape {
    private final double x1;
    private final double x2;
    private final double x3;
    private final double y1;
    private final double y2;
    private final double y3;
    final double epsilon = 1.0e-10;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double getWidth() {
        return Math.max(Math.max(x1, x2), x3) - Math.min(Math.min(x1, x2), x3);
    }

    @Override
    public double getHeight() {
        return Math.max(Math.max(y1, y2), y3) - Math.min(Math.min(y1, y2), y3);
    }

    @Override
    public double getArea() {
        if (Math.abs((x3 - x1) * (y2 - y1) - (x2 - x1) * (y3 - y1)) < epsilon) {
            return 0;
        }

        double triangleSide1Length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double triangleSide2Length = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double triangleSide3Length = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double triangleSemiPerimeter = (triangleSide1Length + triangleSide2Length + triangleSide3Length) / 2;
        return Math.sqrt(triangleSemiPerimeter * (triangleSemiPerimeter - triangleSide1Length) *
                (triangleSemiPerimeter - triangleSide2Length) * (triangleSemiPerimeter - triangleSide3Length));
    }

    @Override
    public double getPerimeter() {
        if (Math.abs((x3 - x1) * (y2 - y1) - (x2 - x1) * (y3 - y1)) < epsilon) {
            return 0;
        }

        double triangleSide1Length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double triangleSide2Length = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double triangleSide3Length = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        return triangleSide1Length + triangleSide2Length + triangleSide3Length;
    }

    @Override
    public String toString() {
        return "треугольник площадью " + getArea() + " и периметром " + getPerimeter();
    }

    @Override
    public boolean equals(Object shape) {
        if (shape == this) {
            return true;
        }

        if (shape == null || shape.getClass() != getClass()) {
            return false;
        }

        Triangle p = (Triangle) shape;
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