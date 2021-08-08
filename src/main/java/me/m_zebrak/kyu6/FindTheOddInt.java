package me.m_zebrak.kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find the one that appears an odd number of times.
 * <p>
 * There will always be only one integer that appears an odd number of times.
 */
public class FindTheOddInt {
    public static int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : map.keySet())
            if (map.get(i) % 2 == 1)
                return i;

        return -1;
    }

    public static int solution2(int[] array) {
        // XOR of all elements gives us odd occurring elements, because XOR of two elements is 0 if both elements are
        // the same and the XOR of a number x with 0 is x
//        int xor = 0;
//        for (int i : array)
//            xor ^= i;
//        return xor;
        return Arrays.stream(array).reduce(0, (x, y) -> x ^ y);
    }
}
