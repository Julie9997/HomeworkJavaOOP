package homework4.gb;

public interface GBList<T> extends Iterable<T>{
    boolean add(T t);

    void add(T t, int index);

    void remove(int index);

    T get(int index);

    int size();

    void update(int index, T t);
}
