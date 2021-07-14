package me.m_zebrak.kyu6;

/**
 * Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows
 * she runs faster than A, and furthermore has not finished her cabbage.
 * <p>
 * When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour. How long will
 * it take B to catch A?
 * <p>
 * More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer
 * > 0) how long will it take B to catch A?
 * <p>
 * The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds (round down to
 * the nearest second) or a string in some languages.
 * <p>
 * If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C, Go, Nim, Pascal,[] for Kotlin or "-1
 * -1 -1".
 * <p>
 * Examples:
 * (form of the result depends on the language)
 * <p>
 * race(720, 850, 70) => [0, 32, 18] or "0 32 18"
 * race(80, 91, 37)   => [3, 21, 49] or "3 21 49"
 */
public class TortoiseRacing {
    public static int[] solution(int v1, int v2, int g) {
        int totalSec = 3600 * g / (v2 - v1);
        return v1 >= v2 ? null : new int[]{totalSec / 3600, totalSec % 3600 / 60, totalSec % 60};
    }
}
