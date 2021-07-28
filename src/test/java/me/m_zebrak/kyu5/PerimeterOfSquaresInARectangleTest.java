package me.m_zebrak.kyu5;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerimeterOfSquaresInARectangleTest {
    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(80), PerimeterOfSquaresInARectangle.solution(BigInteger.valueOf(5)));
    }

    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(216), PerimeterOfSquaresInARectangle.solution(BigInteger.valueOf(7)));
    }

    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(14098308), PerimeterOfSquaresInARectangle.solution(BigInteger.valueOf(30)));
    }
}