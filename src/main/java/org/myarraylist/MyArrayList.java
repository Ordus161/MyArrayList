package org.myarraylist;

import java.util.Collection;
import java.util.Iterator;

public class MyArrayList<T> implements ListInterface<T>{

    private T[] values;

    public T[] getValues() {
        return values;
    }

    public MyArrayList() {
       values = (T[]) new Object[0];
    }

    @Override
    public boolean add(T data) {
        try{
            T[] buffer = values;
            values = (T[]) new Object[buffer.length+1];
            System.arraycopy(buffer,0, values, 0, buffer.length);
            values[values.length -1] = data;
            return true;
        } catch (ClassCastException exception){
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
       try {
           T[] buffer = values;
           values = (T[]) new Object[buffer.length - 1];
           System.arraycopy(buffer, 0, values, 0, index);
           int elementsQuantityAfterIndex = buffer.length - index - 1;
           System.arraycopy(buffer, index + 1, values, index, elementsQuantityAfterIndex);

       } catch (ClassCastException exception){
           exception.printStackTrace();
       }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public boolean addAll(int index, MyArrayList t)  {
        try{
            T[] buffer = values;
            T[] buffer2 = (T[]) t.getValues();

            values = (T[]) new Object[buffer.length+ buffer2.length];
            System.arraycopy(buffer,0, values, 0, buffer.length);
            System.arraycopy(buffer2,0, values, buffer.length, buffer2.length);
//            values[values.length - buffer2.length] = (T) t;
            return true;
        } catch (ClassCastException exception){
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public void sort() {

    }

    @Override
    public int size() {
        int size = 0;
        if(values != null) return size = values.length;
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator<T>(values);
    }
}
