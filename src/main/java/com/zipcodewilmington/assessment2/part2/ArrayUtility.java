package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] result = new Integer[array1.length + array2.length];
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            result [counter] = array1[i];
            counter++;
        }
        for (int i = 0; i < array2.length; i++) {
            result [counter] = array2[i];
            counter++;
        }
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
//
//        for (int i = 0; i < index; i++) {
//            for (int j = array.length - 1; j > 0; j--) {
//                int temp = array[j];
//                array[j] = array[j - 1];
//                array[j - 1] = temp;
//            }
//        }

            return array;
    }
    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer result = 0;
        Integer[] merged = merge(array1,array2);
        for (Integer i: merged
             ) {
            if(i == null) {result = null;}
            else if(i.equals(valueToEvaluate)) {
                result++;
            }
        }
        return result;
    }

    public Integer mostCommon(Integer[] array) {
        Integer mostCommon = 0;
        Integer result = 0;
        Integer temp;
        Integer[] second = {999999999};
        for (Integer i : array
             ) {
            if (i == null) {result = null; break;}
            temp =countOccurrence(array, second,i);
            if ( temp > mostCommon) {
                mostCommon = temp;
                result = i;
            }
        }
        return result;
    }
}
