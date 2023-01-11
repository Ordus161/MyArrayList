package org.myarraylist;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");

        MyArrayList<Object> strings2 = new MyArrayList<>();
        strings2.add("4");
        strings2.add("5");
        strings2.add("6");

        strings.addAll(3, strings2);
        System.out.println(strings.get(3));


        ListInterface<Integer> numbers = new MyArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        MyArrayList<Integer> numbers2 = new MyArrayList<>();
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);

        System.out.println(numbers.size());

        numbers.addAll(3, numbers2);
        System.out.println(numbers.get(3));

        MyArrayList<Object> objects = new MyArrayList<>();
        objects.add(numbers);


        System.out.println(objects.size());
    }
}