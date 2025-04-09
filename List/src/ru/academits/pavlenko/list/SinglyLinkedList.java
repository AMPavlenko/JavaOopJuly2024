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
}