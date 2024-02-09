package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();

        for (Map.Entry<String, Integer> entry: sourceMap.entrySet()) {
            int key=entry.getValue();
            Set<String> values = new HashSet<>();
            for (Map.Entry<String, Integer> entry2: sourceMap.entrySet()){
                if (entry2.getValue()==key){
                    values.add(entry.getKey());
                }
            }
            result.put(key, values);
        }

        return result;
    }
}
