package me.m_zebrak.kyu5;

/**
 * The Fibonacci numbers are the numbers in the following integer sequence (Fn):
 * <p>
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
 * <p>
 * such as
 * <p>
 * F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.
 * <p>
 * Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying
 * <p>
 * F(n) * F(n+1) = prod.
 * <p>
 * Your function productFib takes an integer (prod) and returns an array:
 * <p>
 * [F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
 * depending on the language if F(n) * F(n+1) = prod.
 * <p>
 * If you don't find two consecutive F(n) verifying F(n) * F(n+1) = prodyou will return
 * <p>
 * [F(n), F(n+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
 * F(n) being the smallest one such as F(n) * F(n+1) > prod.
 * <p>
 * Some Examples of Return:
 * (depend on the language)
 * <p>
 * productFib(714) # should return (21, 34, true),
 * # since F(8) = 21, F(9) = 34 and 714 = 21 * 34
 * <p>
 * productFib(800) # should return (34, 55, false),
 * # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55
 * -----
 * productFib(714) # should return [21, 34, true],
 * productFib(800) # should return [34, 55, false],
 * -----
 * productFib(714) # should return {21, 34, 1},
 * productFib(800) # should return {34, 55, 0},
 * -----
 * productFib(714) # should return {21, 34, true},
 * productFib(800) # should return {34, 55, false},
 */
public class ProductOfConsecutiveFibNumbers {
    public static long[] solution(long prod) {
        long a = 0;
        long b = 1;

        while (prod > a * b) {
            b += a;
            a = b - a;
        }

        return new long[]{a, b, prod == a * b ? 1 : 0};
    }
}
