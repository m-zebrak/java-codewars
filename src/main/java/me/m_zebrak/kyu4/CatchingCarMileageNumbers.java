package me.m_zebrak.kyu4;

import java.util.stream.IntStream;

/**
 * Let's make it so Bob never misses another interesting number. We've hacked into his car's computer, and we have a box hooked up that reads mileage numbers. We've got a box glued to his dash that lights up yellow or green depending on whether it receives a 1 or a 2 (respectively).
 * <p>
 * It's up to you, intrepid warrior, to glue the parts together. Write the function that parses the mileage number input, and returns a 2 if the number is "interesting" (see below), a 1 if an interesting number occurs within the next two miles, or a 0 if the number is not interesting.
 * <p>
 * Note: In Haskell, we use No, Almost and Yes instead of 0, 1 and 2.
 * <p>
 * "Interesting" Numbers
 * Interesting numbers are 3-or-more digit numbers that meet one or more of the following criteria:
 * <p>
 * Any digit followed by all zeros: 100, 90000
 * Every digit is the same number: 1111
 * The digits are sequential, incementing†: 1234
 * The digits are sequential, decrementing‡: 4321
 * The digits are a palindrome: 1221 or 73837
 * The digits match one of the values in the awesomePhrases array
 * † For incrementing sequences, 0 should come after 9, and not before 1, as in 7890.
 * ‡ For decrementing sequences, 0 should come after 1, and not before 9, as in 3210.
 * <p>
 * So, you should expect these inputs and outputs:
 * <p>
 * // "boring" numbers
 * CarMileage.isInteresting(3, new int[]{1337, 256});    // 0
 * CarMileage.isInteresting(3236, new int[]{1337, 256}); // 0
 * <p>
 * // progress as we near an "interesting" number
 * CarMileage.isInteresting(11207, new int[]{}); // 0
 * CarMileage.isInteresting(11208, new int[]{}); // 0
 * CarMileage.isInteresting(11209, new int[]{}); // 1
 * CarMileage.isInteresting(11210, new int[]{}); // 1
 * CarMileage.isInteresting(11211, new int[]{}); // 2
 * <p>
 * // nearing a provided "awesome phrase"
 * CarMileage.isInteresting(1335, new int[]{1337, 256}); // 1
 * CarMileage.isInteresting(1336, new int[]{1337, 256}); // 1
 * CarMileage.isInteresting(1337, new int[]{1337, 256}); // 2
 */
public class CatchingCarMileageNumbers {
    public static int solution(int number, int[] awesomePhrases) {
        return testNumberShorter(number, awesomePhrases) ? 2 :
               testNumberShorter(number + 1, awesomePhrases) ? 1 :
               testNumberShorter(number + 2, awesomePhrases) ? 1 : 0;
    }

    public static boolean testNumberShorter(int number, int[] awesomePhrases) {
        String numberStr = Integer.toString(number);
        return numberStr.length() >= 3 &&
               (numberStr.matches("\\d0+") ||
                numberStr.chars().distinct().count() == 1 ||
                "1234567890".contains(numberStr) ||
                "9876543210".contains(numberStr) ||
                numberStr.equals(new StringBuilder(numberStr).reverse().toString()) ||
                IntStream.of(awesomePhrases).anyMatch(i -> i == number));
    }

    public static int solution2(int number, int[] awesomePhrases) {
        if (testNumber(number, awesomePhrases)) return 2;
        if (testUpcoming2(number, awesomePhrases)) return 1;
        return 0;
    }

    public static boolean testNumber(int number, int[] awesomePhrases) {
        String numberStr = Integer.toString(number);
        return (hasAtLeast3Digits(numberStr) && (followedByZeros(numberStr) || sameNumbers(numberStr) || sequentialIncrementing(numberStr)
                                                 || sequentialDecrementing(numberStr) || palindrome(numberStr) || matchInArray(number, awesomePhrases)));
    }

    public static boolean testUpcoming2(int number, int[] awesomePhrases) {
        for (int i = 1; i <= 2; i++)
            if (testNumber(number + i, awesomePhrases)) return true;
        return false;
    }

    private static boolean hasAtLeast3Digits(String numberStr) {
        return numberStr.length() >= 3;
    }

    private static boolean followedByZeros(String numberStr) {
        return numberStr.matches("\\d0+");
    }

    private static boolean sameNumbers(String numberStr) {
        return numberStr.replaceAll(numberStr.substring(0, 1), "").length() == 0;
    }

    private static boolean sequentialIncrementing(String numberStr) {
        return "1234567890".contains(numberStr);
    }

    private static boolean sequentialDecrementing(String numberStr) {
        return "9876543210".contains(numberStr);
    }

    private static boolean palindrome(String numberStr) {
        return numberStr.equals(new StringBuffer(numberStr).reverse().toString());
    }

    private static boolean matchInArray(int number, int[] awesomePhrases) {
        for (int phrase : awesomePhrases)
            if (phrase == number)
                return true;
        return false;
    }
}
