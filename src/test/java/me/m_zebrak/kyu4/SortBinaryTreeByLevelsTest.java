package me.m_zebrak.kyu4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortBinaryTreeByLevelsTest {
    @Test
    public void nullTest() {
        assertEquals(Arrays.asList(), SortBinaryTreeByLevels.solution(null));
    }

    @Test
    public void basicTest() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), SortBinaryTreeByLevels.solution(new Node(new Node(null, new Node(null, null, 4), 2), new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1)));
    }
}