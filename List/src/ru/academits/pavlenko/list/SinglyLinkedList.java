package ru.academits.pavlenko.list;

public class SinglyLinkedList<T> {
    private ListItem<T> head;
    private int count;

    public SinglyLinkedList() {
        this.head = null;
        this.count = 0;
    }

    public int getSize() {
        return count;
    }

    public T getFirstValue() {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }
        return head.getData();
    }

    public T getValueAtIndex(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Некорректный индекс");
        }

        ListItem<T> currentItem = head;
        for (int i = 0; i < index; i++) {
            currentItem = currentItem.getNext();
        }

        return currentItem.getData();
    }

    public T setValueAtIndex(int index, T data) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Некорректный индекс");
        }

        ListItem<T> currentItem = head;
        for (int i = 0; i < index; i++) {
            currentItem = currentItem.getNext();
        }

        T previousData = currentItem.getData();
        currentItem.setData(data);

        return previousData;
    }

    public T removeAtIndex(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Некорректный индекс");
        }

        T removedData;

        if (index == 0) {
            removedData = head.getData();
            head = head.getNext();
        } else {
            ListItem<T> currentItem = head;
            for (int i = 0; i < index - 1; i++) {
                currentItem = currentItem.getNext();
            }

            removedData = currentItem.getNext().getData();
            currentItem.setNext(currentItem.getNext().getNext());
        }

        count--;
        return removedData;
    }

    public void insertAtBeginning(T data) {
        head = new ListItem<>(data, head);

        count++;
    }

    public void insertAtIndex(int index, T data) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Некорректный индекс");
        }

        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        ListItem<T> newItem = new ListItem<>(data);
        ListItem<T> currentItem = head;
        for (int i = 0; i < index - 1; i++) {
            currentItem = currentItem.getNext();
        }

        newItem.setNext(currentItem.getNext());
        currentItem.setNext(newItem);
        count++;
    }

    public boolean removeByData(T data) {
        if (head == null) {
            return false;
        }

        if (head.getData() == data) {
            head = head.getNext();
            count--;
            return true;
        }

        ListItem<T> currentItem = head;
        while (currentItem.getNext() != null && currentItem.getNext().getData() != data) {
            currentItem = currentItem.getNext();
        }

        if (currentItem.getNext() == null) {
            return false;
        }

        currentItem.setNext(currentItem.getNext().getNext());
        count--;

        return true;
    }

    public T removeFirst() {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }

        T removedData = head.getData();
        head = head.getNext();
        count--;

        return removedData;
    }

    public void reverse() {
        ListItem<T> previousItem = null;
        ListItem<T> currentItem = head;
        ListItem<T> nextItem;

        while (currentItem != null) {
            nextItem = currentItem.getNext();
            currentItem.setNext(previousItem);
            previousItem = currentItem;
            currentItem = nextItem;
        }

        head = previousItem;
    }

    public SinglyLinkedList<T> copyList() {
        SinglyLinkedList<T> newList = new SinglyLinkedList<>();
        ListItem<T> currentItem = head;

        while (currentItem != null) {
            newList.insertAtBeginning(currentItem.getData());
            currentItem = currentItem.getNext();
        }

        newList.reverse();

        return newList;
    }
}