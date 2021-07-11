package me.m_zebrak.kyu7;

import java.util.stream.Collectors;

/**
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 * <p>
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 * <p>
 * Note: The function accepts an integer and returns an integer
 */
public class SquareEveryDigit {
    public static int solution(int n) {
        return Integer.toString(n)
                .chars()
                .map(i -> (i - '0') * (i - '0'))
                .mapToObj(Integer::toString)
                .collect(Collectors.collectingAndThen(Collectors.joining(), i -> Integer.parseInt(i)));
    }
}