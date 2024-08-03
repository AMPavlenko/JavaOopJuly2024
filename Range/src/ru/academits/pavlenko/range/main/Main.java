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

        System.out.printf("Исходный диапазон чисел был изменен. Новый диапазон чисел начинается с %f и " +
                "заканчивается на %f.%n", range.getFrom(), range.getTo());
        System.out.printf("Длина диапазона A равна %f.%n", range.getLength());

        System.out.println("Введите число для установки нижней границы первого интервала:");
        double range1Start = scanner.nextDouble();

        System.out.println("Введите число для установки верхней границы первого интервала:");
        double range1End = scanner.nextDouble();

        System.out.println("Введите число для установки нижней границы второго интервала:");
        double range2Start = scanner.nextDouble();

        System.out.println("Введите число для установки верхней границы второго интервала:");
        double range2End = scanner.nextDouble();

        Range range1 = new Range(range1Start, range1End);
        Range range2 = new Range(range2Start, range2End);

        Range intersection = range1.getIntersection(range2);
        System.out.println("Интервал-пересечения двух интервалов: " + intersection);

        Range[] union = range1.getUnion(range2);
        System.out.println("Интервал-объединение двух интервалов: " + Arrays.toString(union));

        Range[] difference = range1.getDifference(range2);
        System.out.println("Интервал-разность двух интервалов (первый интервал\\второй интервал): "
                + Arrays.toString(difference));
    }
}