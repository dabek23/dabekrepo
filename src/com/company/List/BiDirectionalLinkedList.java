package com.company.List;

public class BiDirectionalLinkedList {

    private Entry entry;

    public void add(Object val) {
        Entry current;
        if (entry == null) entry = new Entry (val, null, null);
        if (entry.prev == null) {
            current = new Entry(val, entry, entry);
            entry.next = current;
        }
        current = new Entry(val, entry.prev, entry);
        entry.prev = current;
    }
    class Entry {
        Object item;
        Entry prev;
        Entry next;

        public Entry(Object item, Entry prev, Entry next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }
}
