package me.m_zebrak.kyu7;

import java.util.Arrays;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 * <p>
 * String will never be empty and you do not need to account for different data types.
 */
public class ShortestWord {
    public static int solution(String s) {
        return Arrays.stream(s.split("\\s+"))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}