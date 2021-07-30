package me.m_zebrak.kyu4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwiceLinearTest {
    @Nested
    @DisplayName("solution")
    @TestInstance(Lifecycle.PER_CLASS)
    class solution {
        @Test
        public void test() {
            assertEquals(TwiceLinear.solution(10), 22);
            assertEquals(TwiceLinear.solution(20), 57);
            assertEquals(TwiceLinear.solution(30), 91);
            assertEquals(TwiceLinear.solution(50), 175);
        }
    }

    @Nested
    @DisplayName("solution2")
    @TestInstance(Lifecycle.PER_CLASS)
    class solution2 {
        @Test
        public void test() {
            assertEquals(TwiceLinear.solution2(10), 22);
            assertEquals(TwiceLinear.solution2(20), 57);
            assertEquals(TwiceLinear.solution2(30), 91);
            assertEquals(TwiceLinear.solution2(50), 175);
        }
    }
}