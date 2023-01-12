package org.myarraylist;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
//        MyArrayList<String> strings = new MyArrayList<>();
//        strings.add("first");
//        strings.add("second");
//        strings.add("third");
//
//        MyArrayList<Object> strings2 = new MyArrayList<>();
//        strings2.add("4");
//        strings2.add("5");
//        strings2.add("6");
//
//        strings.addAll(3, strings2);
//        System.out.println(strings.get(3));
//
//
//        ListInterface<Integer> numbers = new MyArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        MyArrayList<Integer> numbers2 = new MyArrayList<>();
//        numbers2.add(4);
//        numbers2.add(5);
//        numbers2.add(6);
//
//        System.out.println(numbers.size());
//
//        numbers.addAll(3, numbers2);
//        System.out.println(numbers.get(3));

        MyArrayList<SortingDummy> objects = new MyArrayList<>();

        for (int i = 0; i < 5; i++) {
            int randomInt = (int) getRandomIntegerBetweenRange(1,20);
            objects.add(new SortingDummy(randomInt));
        }

        for ( SortingDummy object : objects ) {
            System.out.println(object.getId());
            //System.out.println(object.getDummyName());
        }

        System.out.println("Sorting");

        bubbleSort(objects);
        for ( SortingDummy object : objects ) {
            System.out.println(object.getId());
            //System.out.println(object.getDummyName());
        }

    }

    public static double getRandomIntegerBetweenRange(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    public static void bubbleSort(MyArrayList<SortingDummy> myArrayList) {
            SortingDummy buffer;
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < myArrayList.size() - 1; i++) {
                    if (myArrayList.get(i).compareTo(myArrayList.get(i + 1)) > 0) {
                        buffer = myArrayList.get(i);
                        myArrayList.set(i, myArrayList.get(i + 1));
                        myArrayList.set(i + 1, buffer);
                        sorted = false;
                    }

                }
            }
        }

}