package me.m_zebrak.kyu6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed
 * a string and you must return that string in an array where an uppercase letter is a person standing up.
 * Rules
 * 1.  The input string will always be lower case but maybe empty.
 * <p>
 * 2.  If the character in the string is whitespace then pass over it as if it was an empty seat
 * Example
 * wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 */
public class MexicanWave {
    public static String[] solution(String str) {
        List<String> lst = new ArrayList();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') continue;
            lst.add(str.substring(0, i) + String.valueOf(str.charAt(i)).toUpperCase() + str.substring(i + 1));
        }

        return lst.toArray(String[]::new);
    }

    public static String[] solution2(String str) {
        return IntStream
                .range(0, str.length())
                .mapToObj(i -> str.substring(0, i) + String.valueOf(str.charAt(i)).toUpperCase() + str.substring(i + 1))
                .filter(s -> !s.equals(str)) //if space was "capitalized" - new "s" is the same as the given "str"
                .toArray(String[]::new);
    }
}
