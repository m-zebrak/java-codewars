package me.m_zebrak.kyu4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwiceLinearTest {
    @Test
    public void test() {
        assertEquals(TwiceLinear.solution(10), 22);
        assertEquals(TwiceLinear.solution(20), 57);
        assertEquals(TwiceLinear.solution(30), 91);
        assertEquals(TwiceLinear.solution(50), 175);
    }
}