package com.zipcodewilmington.assessment2.part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtility {
    private ArrayList <Integer> arr = new ArrayList<>(1);
    private ArrayList <String> strings = new ArrayList<>(1);



    public Boolean add(int i) {
        arr.add(i);
        return arr.contains(i);
    }

    public Integer size() {
        return arr.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> result = new ArrayList<>(1);

        return result;
    }

    public String join() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : arr
             ) {
        stringBuilder.append(i);
        }

        return stringBuilder.toString();
    }

    public Integer mostCommon() {
        int numOc = 0;
        Integer most = arr.get(0);
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.size() ; j++) {
                if (arr.get(i).equals(arr.get(j))) {

                }
            }
        }


        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return arr.contains(valueToAdd);
    }
}
