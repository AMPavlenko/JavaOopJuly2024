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

    public Range getIntersection(Range range) {
        if (from < range.to && to > range.from) {
            return new Range(Math.max(range.from, from), Math.min(range.to, to));
        }

        return null;
    }

    public Range[] getUnion(Range range) {
        if (range.from > to || from > range.to) {
            return new Range[]{new Range(from, to), new Range(range.from, range.to)};
        }

        return new Range[]{new Range(Math.min(range.from, from), Math.max(range.to, to))};
    }

    public Range[] getDifference(Range range) {
        if (from < range.from) {
            if (range.to < to) {
                return new Range[]{new Range(from, range.from), new Range(range.to, to)};
            }

            if (range.from <= to) {
                return new Range[]{new Range(from, range.from)};
            }
        } else {
            if (to <= range.to) {
                return new Range[0];
            }

            if (from <= range.to) {
                return new Range[]{new Range(range.to, to)};
            }
        }

        return new Range[]{new Range(from, to)};
    }

    @Override
    public String toString() {
        return "{" + from + ":" + to + "}";
    }
}