package me.m_zebrak.kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DirectionsReductionTest {
    @Test
    public void test() {
        assertArrayEquals(new String[]{"WEST"}, DirectionsReduction.solution(
                new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
        assertArrayEquals(new String[]{}, DirectionsReduction.solution(
                new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}));
    }
}