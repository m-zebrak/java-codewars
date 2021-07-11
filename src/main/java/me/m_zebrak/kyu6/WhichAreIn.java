package me.m_zebrak.kyu6;

import java.util.stream.Stream;

/**
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
 * <p>
 * Example 1:
 * a1 = ["arp", "live", "strong"]
 * <p>
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * <p>
 * returns ["arp", "live", "strong"]
 * <p>
 * Example 2:
 * a1 = ["tarp", "mice", "bull"]
 * <p>
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * <p>
 * returns []
 * <p>
 * Notes:
 * Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 * In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
 * Beware: r must be without duplicates.
 */
public class WhichAreIn {
    public static String[] solution(String[] a, String[] b) {
        return Stream.of(a)
                .filter(x -> Stream.of(b).anyMatch(y -> y.contains(x)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}