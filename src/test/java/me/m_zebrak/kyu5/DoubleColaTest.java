package me.m_zebrak.kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleColaTest {
    String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

    @Test
    public void test1() {
        assertEquals("Sheldon", DoubleCola.solution(names, 1));
    }

    @Test
    public void test2() {
        assertEquals("Sheldon", DoubleCola.solution(names, 6));
    }
}