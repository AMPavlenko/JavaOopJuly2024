package ru.academits.pavlenko.arraylisthome.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("file.txt"))) {
            /*
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextDouble();
            }
*/
            System.out.println(scanner.nextLine());

        }
    }
}