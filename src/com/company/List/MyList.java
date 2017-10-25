package com.company.List;
@SuppressWarnings("unchecked")
public class MyList<T> {



    private T[] items2;
    private static final int DEFAULT_SIZE = 10;
    public Object getByPosition;
    int index = 0;
    private Object[] items = new Object[DEFAULT_SIZE];

    public void add(T e) {
        resize();
        items[index] = e;
        index++;
    }

    public int remove(int q) {
        if (q < items.length) {
            for (int i = 0; i < q; i++) {
                items[index] = items[index + 1];
                index--;
            }
        }
        return q;
    }

    public int indexOf(T o) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == o) return i;
            throw new RuntimeException();
        }
        return 0;
    }
    public T getByPosition(int pos) {
        if (pos > index || pos < 0) throw new IndexOutOfBoundsException();
        return (T)items[pos];
    }

    private void resize() {
        if (index > items.length) {
            Object[] temp = new Object[items.length * 2];
            System.arraycopy(items, 0, temp, 0, index);
            items = temp;
        }
    }
//    public <K, V, T> T getFromMap (Map<K, List<V>>, K key, List<T> list) {
}