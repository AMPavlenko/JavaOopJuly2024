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
            throw new FileNotFoundException("Файл %f не найден!", fileName);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> fileList = getList("file1.txt");
        System.out.println(fileList);



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