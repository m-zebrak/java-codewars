package me.m_zebrak.kyu6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MexicanWaveTest {
    @Nested
    @DisplayName("solution")
    @TestInstance(Lifecycle.PER_CLASS)
    class solution {
        @Test
        public void basicTest1() {
            String[] result = new String[]{"Hello", "hEllo", "heLlo", "helLo", "hellO"};
            assertArrayEquals(result, MexicanWave.solution("hello"),
                    "it should return '" + Arrays.toString(result) + "'");
        }

        @Test
        public void basicTest2() {
            String[] result = new String[]{"Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs",
                    "codewaRs", "codewarS"};
            assertArrayEquals(result, MexicanWave.solution("codewars"),
                    "it should return '" + Arrays.toString(result) + "'");
        }

        @Test
        public void basicTest3() {
            String[] result = new String[]{};
            assertArrayEquals(result, MexicanWave.solution(""),
                    "it should return '" + Arrays.toString(result) + "'");
        }

        @Test
        public void basicTest4() {
            String[] result = new String[]{"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds",
                    "two worDs", "two wordS"};
            assertArrayEquals(result, MexicanWave.solution("two words"),
                    "it should return '" + Arrays.toString(result) + "'");
        }

        @Test
        public void basicTest5() {
            String[] result = new String[]{" Gap ", " gAp ", " gaP "};
            assertArrayEquals(result, MexicanWave.solution(" gap "),
                    "it should return '" + Arrays.toString(result) + "'");
        }
    }

    @Nested
    @DisplayName("solution 2")
    @TestInstance(Lifecycle.PER_CLASS)
    class solution2 {
        @Test
        public void basicTest1() {
            String[] result = new String[]{"Hello", "hEllo", "heLlo", "helLo", "hellO"};
            assertArrayEquals(result, MexicanWave.solution2("hello"),
                    "it should return '" + Arrays.toString(result) + "'");
        }

        @Test
        public void basicTest2() {
            String[] result = new String[]{"Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs",
                    "codewaRs", "codewarS"};
            assertArrayEquals(result, MexicanWave.solution2("codewars"),
                    "it should return '" + Arrays.toString(result) + "'");
        }

        @Test
        public void basicTest3() {
            String[] result = new String[]{};
            assertArrayEquals(result, MexicanWave.solution2(""),
                    "it should return '" + Arrays.toString(result) + "'");
        }

        @Test
        public void basicTest4() {
            String[] result = new String[]{"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds",
                    "two worDs", "two wordS"};
            assertArrayEquals(result, MexicanWave.solution2("two words"),
                    "it should return '" + Arrays.toString(result) + "'");
        }

        @Test
        public void basicTest5() {
            String[] result = new String[]{" Gap ", " gAp ", " gaP "};
            assertArrayEquals(result, MexicanWave.solution2(" gap "),
                    "it should return '" + Arrays.toString(result) + "'");
        }
    }
}