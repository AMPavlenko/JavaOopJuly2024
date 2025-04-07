package ru.academits.pavlenko.arraylisthome;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListHome {
    public static ArrayList<String> getList(String fileName) throws FileNotFoundException {
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
        ArrayList<String> fileList = getList("file.txt");
        System.out.println(fileList);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 129, 130, -130, -129));

        System.out.println(getOddValuesList(list));

        System.out.println(getUniqueValuesList(list));
    }
}