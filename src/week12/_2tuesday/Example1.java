package week12._2tuesday;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    // Write a program that creates a map with Integer 10 keys and 10 values.
    // Fill this map with random numbers between 0-100. And then find the sum of the keys
    // and values separately
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while (map.size() < 10) {
            map.put((int) (Math.random() * 100), (int) (Math.random() * 100));
        }
        System.out.println("map = " + map);
        int sumKeys=0;
        int sumValues=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            sumKeys+=entry.getKey();
            sumValues+=entry.getValue();
        }
        System.out.println("sumKeys = " + sumKeys);
        System.out.println("sumValues = " + sumValues);
    }
}