package me.m_zebrak.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareEveryDigitTest {

    @Test
    public void test() {
        assertEquals(811181, new SquareEveryDigit().solution(9119));
        assertEquals(0, new SquareEveryDigit().solution(0));
    }
}