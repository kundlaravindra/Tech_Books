package com.toshiba;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetKeyUsingValue {

    public static void main(String[] args) {
       Map<Integer, String> testMap = new HashMap<Integer, String>();
        testMap.put(10, "a");
        testMap.put(20, "b");
        testMap.put(30, "c");
        testMap.put(40, "c");
        for (Entry<Integer, String> entry : testMap.entrySet()) {
            if (entry.getValue().equals("c")) {
                System.out.println(entry.getKey());
            }
        }
    }
}