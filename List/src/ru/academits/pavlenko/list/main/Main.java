package ru.academits.pavlenko.list.main;

import ru.academits.pavlenko.list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        // Инициализация пустого односвязного списка
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        // Вставка нового элемента в начало списка
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        // Изменение значения по индексу
        int index = 2;
        Integer data = 45;
        System.out.printf("Старое значение по индексу %d: %s. Новое значение: %s.%n", index,
                list.setValueAtIndex(index, data), list.getValueAtIndex(index));

        // Удаление по индексу
        System.out.printf("Удалено значение %s по индексу %d.%n", list.removeAtIndex(index), index);

        // Вставка элемента по индексу
        Integer newData = 90;
        list.insertAtIndex(index, newData);
        System.out.printf("Добавлено новое значение по индексу %d: %s.%n", index, list.getValueAtIndex(index));

        // Удаление узла по значению
        Integer removedData = 22;
        if (list.removeByData(removedData)) {
            System.out.printf("Узел со значением %d был удален.%n", removedData);
        } else {
            System.out.printf("Узла со значением %d не найдено.%n", removedData);
        }

        // Удаление первого элемента
        System.out.printf("Первый элемент удален. Значение элемента: %s.%n", list.removeFirst());

        // Разворот списка
        System.out.printf("Значение первого элемента списка равно %s, а последнего %s.%n",
                list.getFirstValue(), list.getValueAtIndex(list.getSize() - 1));
        list.reverse();
        System.out.printf("После разворота списка значение первого элемента равно %s, а последнего %s.%n",
                list.getFirstValue(), list.getValueAtIndex(list.getSize() - 1));

        // Получение размера списка
        System.out.println("Размер списка: " + list.getSize());

        // Копирование списка
        SinglyLinkedList<Integer> newList = list.copyList();
        System.out.printf("Значение первого элемента скопированного списка равно %s, а последнего %s.%n",
                newList.getFirstValue(), newList.getValueAtIndex(newList.getSize() - 1));
    }
}