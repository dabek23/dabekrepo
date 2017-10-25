package com.company.List;

public class MyLinkedList {

    private Entry entry;
    private int size = 0;

    public void remove(Object e) {
        if (entry == null) return;

        Entry prev = null;
        Entry toRemove = null;
        Entry next = null;

        while (toRemove.val != e) {
            prev = toRemove;
            toRemove = next;
            next = next.next;
        }
        toRemove.next = null;
        prev.next = next.next;
        size--;
    }

    public void add (Object e){
        Entry elementToAdd = new Entry(e);

        if (entry == null) {
            entry = elementToAdd;
            return;
        }
        Entry current = entry.next;
        Entry lastValue = entry;
        while (current != null) {
            lastValue = current;
            current = entry.next;
        }
        lastValue.next = new Entry(e);
    }

    public void size (Object e){

    }

    class Entry {
        Object val;
        Entry next;

        public Entry(Object val) {
            this.val = val;
        }
    }
}