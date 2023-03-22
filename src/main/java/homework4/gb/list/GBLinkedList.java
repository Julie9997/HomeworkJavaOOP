package homework4.gb.list;

import homework4.gb.GBDeque;
import homework4.gb.GBList;
import org.jetbrains.annotations.NotNull;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class GBLinkedList<T> implements GBList<T>, GBDeque<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public GBLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(T t) {
        Node<T> newNode = new Node<>(t);
        if (head == null) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    @Override
    public void addLast(T t) {
        Node<T> newNode = new Node<>(t);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    @Override
    public void removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("Список пустой");
        }
        Node<T> temp = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
    }

    @Override
    public void removeLast() {
        if (tail == null) {
            throw new NoSuchElementException("Список пустой");
        }
        Node<T> temp = tail;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
    }

    @Override
    public boolean add(T t) {
        addLast(t);
        return true;
    }

    public void add(T t, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }
        if (index == 0) {
            addFirst(t);
            return;
        }
        if (index == size) {
            addLast(t);
            return;
        }
        Node<T> newNode = new Node<>(t);
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }
        if (index == 0) {
            removeFirst();
        }
        if (index == size - 1) {
            removeLast();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        Node<T> temp = current;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void update(int index, T t) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = t;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public T next() {
                return get(counter++);
            }
        };
    }

    private static class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

}
