package org.myarraylist;

import java.util.Iterator;


public class MyArrayListIterator <T> implements Iterator {
    private int index = 0;
    T[] values;

    public MyArrayListIterator(T[] values) {
        this.values = values;
    }

    public T next(){
        return values[index++];
    }

    public boolean hasNext(){
        return index < values.length;
    }
}
