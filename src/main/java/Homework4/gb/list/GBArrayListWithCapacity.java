package Homework4.gb.list;

import Homework4.gb.GBList;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class GBArrayListWithCapacity<T> implements GBList<T> {
    private T[] values;
    private int size;
    private int capacity;

    public GBArrayListWithCapacity(int capacity) {
        this.values = (T[]) new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean add(T element) {
        if (size == capacity) {
            // Если массив полностью заполнен, увеличиваем его емкость на 50%
            capacity = capacity + (capacity / 2);
            T[] newArray = (T[]) new Object[capacity];
            System.arraycopy(values, 0, newArray, 0, size);
            values = newArray;
        }
        values[size++] = element;
        return true;
    }

    @Override
    public void add(T t, int index) {
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс за пределами списка: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            values[i] = values[i + 1];
        }
        values[size - 1] = null;
        size--;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс за пределами списка: " + index);
        }
        return values[index];
    }

    public int size() {
        return size;
    }

    @Override
    public void update(int index, T t) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс за пределами списка: " + index);
        }
        values[index] = t;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }
}
