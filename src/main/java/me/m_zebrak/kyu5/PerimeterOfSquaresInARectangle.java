package me.m_zebrak.kyu5;

import java.math.BigInteger;

/**
 * The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that the sum of
 * the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80
 * <p>
 * Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed
 * in the same manner as in the drawing:
 * <p>
 * http://i.imgur.com/EYcuB1wm.jpg
 * <p>
 * Hint:
 * See Fibonacci sequence
 * <p>
 * Ref:
 * http://oeis.org/A000045
 * <p>
 * The function perimeter has for parameter n where n + 1 is the number of squares (they are numbered from 0 to n)
 * and returns the total perimeter of all the squares.
 */
public class PerimeterOfSquaresInARectangle {
    public static BigInteger solution(BigInteger n) {
        BigInteger a;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            a = b;
            b = c;
            c = a.add(b);
            sum = sum.add(a);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }
}
