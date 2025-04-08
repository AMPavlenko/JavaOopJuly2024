package ru.academits.pavlenko.arraylisthome;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListHome {
    public static ArrayList<String> getFileDataList(String fileName) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            ArrayList<String> list = new ArrayList<>();
            String line;

            while ((line = br.readLine()) != null) {
                list.add(line);
            }

            return list;
        } catch (IOException e) {
            throw new FileNotFoundException("Файл не найден!");
        }
    }

    public static ArrayList<Integer> getOddValuesList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                for (int j = i; j < list.size() - 1; j++) {
                    list.set(j, list.get(j + 1));
                }

                list.removeLast();
                i--;
            }
        }

        //list.removeIf(element -> element % 2 == 0);
        return list;
    }

    public static ArrayList<Integer> getUniqueValuesList(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueValuesList = new ArrayList<>(list.size());
        int j = 0;

        while (j < list.size()) {
            if (!uniqueValuesList.contains(list.get(j))) {
                uniqueValuesList.add(list.get(j));
            }

            j++;
        }

        return uniqueValuesList;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Первая подзадача
        String fileName = "file.txt";
        ArrayList<String> fileDataList = getFileDataList(fileName);
        System.out.printf("Все строки из файла %s были скопированы в новый список на массиве: %s.%n", fileName, fileDataList);
        // Вторая подзадача
        ArrayList<Integer> randomValuesList = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 129, 130, -130, -129));
        System.out.printf("Список случайных целых чисел: %s.%n", randomValuesList);
        System.out.printf("Из списка случайных целых чисел были оставлены только нечетные значения: %s.%n",
                getOddValuesList(randomValuesList));
        // Третья подзадача
        System.out.printf("Из списка случайных целых чисел %s был получен список с уникальными значениями: %s.",
                randomValuesList, getUniqueValuesList(randomValuesList));
    }
}