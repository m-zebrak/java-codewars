package me.m_zebrak.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheMissingLetterTest {
    @Test
    public void test() {
        assertEquals('e', FindTheMissingLetter.solution(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindTheMissingLetter.solution(new char[] { 'O','Q','R','S' }));
    }
}