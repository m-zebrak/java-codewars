package me.m_zebrak.kyu6;

import java.util.stream.IntStream;

/**
 * Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing
 * letter in the array.
 * <p>
 * You will always get an valid array. And it will be always exactly one letter be missing. The length of the array
 * will always be at least 2.
 * The array will always contain letters in only one case.
 * <p>
 * Example:
 * <p>
 * ['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'
 */
public class FindTheMissingLetter {
    public static char solution(char[] chars) {
        int pos = IntStream.range(1, chars.length)
                .filter(index -> (chars[index] - chars[index - 1] != 1))
                .findFirst().getAsInt();

        return (char) (chars[pos] - 1);
    }
}
