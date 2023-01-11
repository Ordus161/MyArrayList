package org.myarraylist;


public interface ListInterface<T> extends Iterable<T>{
    boolean add(T t);
    void remove(int index);
    T get(int index);
    boolean addAll(int index, MyArrayList t);
    void sort();
    int size();
}
