package me.m_zebrak.kyu4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatchingCarMileageNumbersTest {
    @Test
    public void testTooSmall() {
        assertEquals(0, CatchingCarMileageNumbers.solution(3, new int[]{1337, 256}));
    }

    @Test
    public void testAlmostAwesome() {
        assertEquals(1, CatchingCarMileageNumbers.solution(1336, new int[]{1337, 256}));
    }

    @Test
    public void testAwesome() {
        assertEquals(2, CatchingCarMileageNumbers.solution(1337, new int[]{1337, 256}));
    }

    @Test
    public void testFarNotInteresting() {
        assertEquals(0, CatchingCarMileageNumbers.solution(11208, new int[]{1337, 256}));
    }

    @Test
    public void testAlmostInteresting() {
        assertEquals(1, CatchingCarMileageNumbers.solution(11209, new int[]{1337, 256}));
    }

    @Test
    public void testInteresting() {
        assertEquals(2, CatchingCarMileageNumbers.solution(11211, new int[]{1337, 256}));
    }
}