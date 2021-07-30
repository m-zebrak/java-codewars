package me.m_zebrak.kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfConsecutiveFibNumbersTest {
    @Test
    public void test1() {
        assertArrayEquals(new long[]{55, 89, 1}, ProductOfConsecutiveFibNumbers.solution(4895));
    }

    @Test
    public void test2() {
        assertArrayEquals(new long[]{89, 144, 0}, ProductOfConsecutiveFibNumbers.solution(5895));
    }
}