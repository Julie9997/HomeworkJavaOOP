package Homework4.gb.list;

import Homework4.gb.GBList;

import java.util.Iterator;

public class GBArrayList<T> implements GBList<T> {
    private T[] values;

    public GBArrayList(){
        this.values = (T[]) new Object[0];
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public boolean add(T t) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length-1] = t;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace(); // вывод ошибки
        }
        return false;
    }

    @Override
    public void add(T t, int index) {
    }

    @Override
    public void remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountAfterIndex = temp.length - index - 1; // количество элементов
            System.arraycopy(temp, index+1, values, index, amountAfterIndex);
        }  catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T t) {
        values[index] = t;
    }
}
