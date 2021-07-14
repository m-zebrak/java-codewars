package me.m_zebrak.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TortoiseRacingTest {
    @Test
    public void test() {
        System.out.println("Basic Tests");
        assertArrayEquals(new int[]{0, 32, 18}, TortoiseRacing.solution(720, 850, 70));
        assertArrayEquals(new int[]{3, 21, 49}, TortoiseRacing.solution(80, 91, 37));
        assertArrayEquals(new int[]{2, 0, 0}, TortoiseRacing.solution(80, 100, 40));
    }
}