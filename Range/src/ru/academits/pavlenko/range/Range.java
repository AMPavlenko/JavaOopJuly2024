package ru.academits.pavlenko.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return number >= from && number <= to;
    }

    public Range getRangesIntersection(double rangeBStart, double rangeBEnd) {

        if (from < rangeBEnd && to > rangeBStart) {
            return new Range(rangeBStart, to);
        } else {
            return null;
        }
    }

    public String toString() {
        return "{" + "}";
    }

}
