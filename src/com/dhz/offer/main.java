package com.dhz.offer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/20 19:23
 */
public class main {

    static void solution(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = map.entrySet().stream()
                .sorted((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()))
                .collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + ":" + list.get(i).getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aaaa", 80);
        map.put("bbbb", 70);
        map.put("cccc", 80);
        map.put("dddd", 90);

        solution(map);
    }
}
