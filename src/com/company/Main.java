package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Pair<Integer, String> test = new Pair<>(1, "one");
        Pair<Integer, String> test2 = new Pair<>(2, "two");
        Pair<Integer, String> test3 = new Pair<>(1, "dfjgdjfh");

        ArrayList<Pair<Integer, String>> list = new ArrayList<>();
        list.add(test);
        list.add(test2);
        list.add(test3);

        PairCollection<Integer, String> collection = new PairCollection<>(list);
//        deleteByValue
        collection.removeByValue("one");
//        deleteByIndex
        collection.getAllItemms().remove(1);
//        addElement
        collection.getAllItemms().add(new Pair(10,"s2dss"));
        ArrayList<Pair> listOfPair = collection.getAllItemms();

        listOfPair.add(new Pair(22, "sds"));
        System.out.println(listOfPair);

    }
}
