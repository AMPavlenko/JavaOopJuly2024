package ru.academits.pavlenko.range.main;

import ru.academits.pavlenko.range.Range;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(-10, 10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите, пожалуйста, число, чтобы проверить принадлежит ли оно исходному диапазону:");
        double number = scanner.nextDouble();

        if (range.isInside(number)) {
            System.out.printf("Данное число %f принадлежит исходному диапазону.%n", number);
        } else {
            System.out.printf("Данное число %f не принадлежит исходному диапазону.%n", number);
        }

        System.out.println("Для изменения нижней границы исходного диапазона введите число:");
        double rangeStart = scanner.nextDouble();

        System.out.println("Для изменения верхней границы исходного диапазона введите число:");
        double rangeEnd = scanner.nextDouble();

        range.setFrom(rangeStart);
        range.setTo(rangeEnd);

        System.out.printf("Исходный диапазон чисел был изменен. Новый диапазон чисел (диапазон A) начинается с %f и " +
                "заканчивается на %f.%n", range.getFrom(), range.getTo());
        System.out.printf("Длина диапазона A равна %f.%n", range.getLength());

        System.out.println("Введите число для установки нижней границы нового диапазона B для проверки пересечения с диапазоном A:");
        double testRangeStart = scanner.nextDouble();

        System.out.println("Введите число для установки верхней границы нового диапазона B для проверки пересечения с диапазоном A:");
        double testRangeEnd = scanner.nextDouble();

        Range testRange = new Range(testRangeStart, testRangeEnd);

        Range RangesIntersection = range.getRangesIntersection(range, testRange);
        System.out.println("Интервал-пересечения двух интервалов А и В: " + RangesIntersection);

        Range[] RangesUnion = range.getRangesUnion(range, testRange);
        System.out.println("Интервал-объединения двух интервалов А и В: " + Arrays.toString(RangesUnion));

        Range[] RangesDifference = range.getRangesDifference(range, testRange);
        System.out.println("Интервал-разность двух интервалов (А\\В): " + Arrays.toString(RangesDifference));
    }
}