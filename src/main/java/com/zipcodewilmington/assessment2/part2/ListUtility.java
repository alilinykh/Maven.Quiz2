package com.zipcodewilmington.assessment2.part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtility {
    private ArrayList<Integer> arr = new ArrayList<>(1);


    public Boolean add(int i) {
        arr.add(i);
        return arr.contains(i);
    }

    public Integer size() {
        return arr.size();
    }

    public List<Integer> getUnique() {

        for (int i = 0; i <arr.size() ; i++) {
            for (int j = 0; j < arr.size(); j++) {
            }
        }
        return arr;
    }

    public String join() {

        return null;
    }

    public Integer mostCommon() {

        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return arr.contains(valueToAdd);
    }
}
