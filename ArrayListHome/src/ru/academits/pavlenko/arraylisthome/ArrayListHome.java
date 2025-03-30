package ru.academits.pavlenko.arraylisthome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListHome {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("file.txt"))) {
            ArrayList<String> list1 = new ArrayList<>();

            while (scanner.hasNextLine()) {
                list1.add(scanner.nextLine());
            }

            System.out.println(list1);
        }

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 129, 130, -130, -129));

        /*
        int i = 0;

        while (i < list2.size()) {

            if (list2.get(i) % 2 == 0) {
                list2.remove(i);
            }

            i++;
        }
        */

        list2.removeIf(element -> element % 2 == 0);

        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 5, 2, 1, 3, 5));
        ArrayList<Integer> list4 = new ArrayList<>();

        int j = 0;

        while (j < list3.size()) {

            if (!list4.contains(list3.get(j))) {
                list4.add(list3.get(j));
            }

            j++;
        }

        System.out.println(list4);
    }
}