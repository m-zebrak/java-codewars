package me.m_zebrak.kyu6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheOddIntTest {
    @Nested
    @DisplayName("solution")
    @TestInstance(Lifecycle.PER_CLASS)
    class solution {
        @Test
        public void findTest() {
            assertEquals(5, FindTheOddInt.solution(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
            assertEquals(-1, FindTheOddInt.solution(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
            assertEquals(5, FindTheOddInt.solution(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
            assertEquals(10, FindTheOddInt.solution(new int[]{10}));
            assertEquals(10, FindTheOddInt.solution(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
            assertEquals(1, FindTheOddInt.solution(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
        }
    }

    @Nested
    @DisplayName("solution2")
    @TestInstance(Lifecycle.PER_CLASS)
    class solution2 {
        @Test
        public void findTest() {
            assertEquals(5, FindTheOddInt.solution2(new int[]
                                                            {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
            assertEquals(-1, FindTheOddInt.solution2(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
            assertEquals(5, FindTheOddInt.solution2(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
            assertEquals(10, FindTheOddInt.solution2(new int[]{10}));
            assertEquals(10, FindTheOddInt.solution2(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
            assertEquals(1, FindTheOddInt.solution2(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
        }
    }
}