package com.zipcodewilmington.assessment2.part2;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Router {
    Map <String,String> map = new TreeMap<>();

    public void add(String path, String controller) {
        this.map.put(path,controller);
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {

        return map.get(path);
    }

    public void update(String path, String studentController) {
        map.replace(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }
    @Override
    public String toString() {

        String result = "";
        for (Map.Entry<String,String> entry : map.entrySet()) {
            result += entry.getKey() + entry.getValue() + "\n";
        }
        return result;
    }

}
