package com.company.List;

public class MyMap<K, V> {
    public static final int DEFAULT_SIZE = 10;
    private Object[] keys = new Object[DEFAULT_SIZE];
    private Object[] values = new Object[DEFAULT_SIZE];
    private int index = 0;

    public void add(K key, V val) {
        ensureCapacity();
        keys[index] = key;
        values[index] = val;
        index++;
    }

    public V get(K key) {
        int pos = -1;
        for (int i = 0; i < index; i++) {
            if (keys[i] == key) pos = i;
        }
        return pos == -1 ? null : (V) values[pos];
    }

    public boolean hasKey(K key) {
        return containsItem(keys, key);
    }

    public boolean hasValue(V value) {
        return containsItem(values, value);
    }

    private boolean containsItem(Object[] all, Object item) {
        for (int i = 0; i < index; i++)
            if (item == all[i]) return true;
        return false;
    }
    private void ensureCapacity() {

    }
}