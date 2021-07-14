package me.m_zebrak.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DeleteOccurrencesOfAnElementTest {
    @Test
    public void test() throws Exception {
        assertArrayEquals(new int[]{20, 37, 21},
                DeleteOccurrencesOfAnElement.solution(new int[]{20, 37, 20, 21}, 1));

        assertArrayEquals(new int[]{1, 1, 3, 3, 7, 2, 2, 2},
                DeleteOccurrencesOfAnElement.solution(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3));

        assertArrayEquals(new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5},
                DeleteOccurrencesOfAnElement.solution(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3));

        assertArrayEquals(new int[]{1, 1, 1, 1, 1},
                DeleteOccurrencesOfAnElement.solution(new int[]{1, 1, 1, 1, 1}, 5));

        assertArrayEquals(new int[]{},
                DeleteOccurrencesOfAnElement.solution(new int[]{}, 5));
    }
}