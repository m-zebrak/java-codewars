package me.m_zebrak.kyu6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TakeATenMinuteWalkTest {
    @Nested
    @DisplayName("solution")
    @TestInstance(Lifecycle.PER_CLASS)
    class solution {
        @Test
        public void test() {
            assertEquals(true, TakeATenMinuteWalk.solution(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n',
                    's'}));
            assertEquals(false, TakeATenMinuteWalk.solution(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w',
                    'e', 'w', 'e'}));
            assertEquals(false, TakeATenMinuteWalk.solution(new char[]{'w'}));
            assertEquals(false, TakeATenMinuteWalk.solution(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n',
                    's'}));
        }
    }

    @Nested
    @DisplayName("solution2")
    @TestInstance(Lifecycle.PER_CLASS)
    class solution2 {
        @Test
        public void test() {
            assertEquals(true, TakeATenMinuteWalk.solution2(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n',
                    's'}));
            assertEquals(false, TakeATenMinuteWalk.solution2(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w',
                    'e', 'w', 'e'}));
            assertEquals(false, TakeATenMinuteWalk.solution2(new char[]{'w'}));
            assertEquals(false, TakeATenMinuteWalk.solution2(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n',
                    's'}));
        }
    }

}