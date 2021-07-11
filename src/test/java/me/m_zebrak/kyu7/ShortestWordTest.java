package me.m_zebrak.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortestWordTest {
    @Test
    public void test(){
        assertEquals(3, ShortestWord.solution("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.solution("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWord.solution("Let's travel abroad shall we"));
        //test added by me
        assertEquals(0, ShortestWord.solution(""));
    }
}