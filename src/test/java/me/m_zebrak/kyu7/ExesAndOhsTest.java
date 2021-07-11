package me.m_zebrak.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExesAndOhsTest {

    public class SolutionTest {
        @Test
        public void testSomething1() {
            assertEquals(true, ExesAndOhs.solution("xxxooo"));
        }

        @Test
        public void testSomething2() {
            assertEquals(true, ExesAndOhs.solution("xxxXooOo"));
        }

        @Test
        public void testSomething3() {
            assertEquals(false, ExesAndOhs.solution("xxx23424esdsfvxXXOOooo"));
        }

        @Test
        public void testSomething4() {
            assertEquals(false, ExesAndOhs.solution("xXxxoewrcoOoo"));
        }

        @Test
        public void testSomething5() {
            assertEquals(false, ExesAndOhs.solution("XxxxooO"));
        }

        @Test
        public void testSomething6() {
            assertEquals(true, ExesAndOhs.solution("zssddd"));
        }

        @Test
        public void testSomething7() {
            assertEquals(false, ExesAndOhs.solution("Xxxxertr34"));
        }
    }
}