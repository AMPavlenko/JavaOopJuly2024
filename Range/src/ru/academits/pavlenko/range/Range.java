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

    public Range getRangesIntersection(Range range, Range testRange) {

        if (range.from < testRange.to && range.to > testRange.from) {
            return new Range(Math.max(testRange.from, range.from), Math.min(testRange.to, range.to));
        } else {
            return null;
        }
    }

    public Range[] getRangesUnion(Range range, Range testRange) {
        if (testRange.from > range.to || range.from > testRange.to) {
            return new Range[]{range, testRange};
        } else {
            return new Range[]{new Range(Math.min(testRange.from, range.from), Math.max(testRange.to, range.to))};
        }
    }

    public Range[] getRangesDifference(Range range, Range testRange) {
        if (testRange.from < range.from && range.to < testRange.to) {
            return null;
        }

    }

    @Override
    public String toString() {
        return "{" + from + ":" + to + "}";
    }
}