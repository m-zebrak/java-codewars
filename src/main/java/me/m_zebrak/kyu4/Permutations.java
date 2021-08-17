package me.m_zebrak.kyu4;

import java.util.*;

/**
 * In this kata you have to create all permutations of an input string and remove duplicates, if present. This means,
 * you have to shuffle all letters from the input in all possible orders.
 * <p>
 * Examples:
 * <p>
 * Permutations.singlePermutations("a") `shouldBe` ["a"]
 * Permutations.singlePermutations("ab") `shouldBe` ["ab", "ba"]
 * Permutations.singlePermutations("aabb") `shouldBe` ["aabb","abab","abba","baab","baba","bbaa"]
 */
public class Permutations {
    public static List<String> solution(String str) {
        if (str.isEmpty())
            return new ArrayList<>(List.of(""));

        List<String> prevResult = solution(str.substring(1));
        Set<String> result = new HashSet<>();

        for (String val : prevResult)
            for (int i = 0; i <= val.length(); i++)
                result.add(val.substring(0, i) + str.charAt(0) + val.substring(i));

        return new ArrayList<>(result);
    }
}