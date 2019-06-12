package com.zipcodewilmington.assessment2.part2;

import java.lang.reflect.Array;
import java.util.*;

public class ListUtility {
    private ArrayList <Integer> arr = new ArrayList<>(1);
    private ArrayList <String> strings = new ArrayList<>(1);


    public Boolean add(Integer i) {
        arr.add(i);
        return arr.contains(i);
    }

    public Integer size() {
        return arr.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> result = new HashSet<>(arr);
        return new ArrayList<>(result);
    }

    public String join() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : arr
             ) {
        stringBuilder.append(i + ", ");
        }
        String result = stringBuilder.toString().substring(0,stringBuilder.toString().length()-2);
        return result;
    }

    public Integer mostCommon() {
        Integer[] newArr = new Integer[arr.size()];
        newArr = arr.toArray(newArr);

        ArrayUtility arrayUtility = new ArrayUtility();

        return arrayUtility.mostCommon(newArr);
    }

    public Boolean contains(Integer valueToAdd) {

        return arr.contains(valueToAdd);
    }
}
