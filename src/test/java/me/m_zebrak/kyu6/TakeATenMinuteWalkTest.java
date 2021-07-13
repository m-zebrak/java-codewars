package me.m_zebrak.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TakeATenMinuteWalkTest {
    @Test
    public void test() {
        assertEquals(true, TakeATenMinuteWalk.solution(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertEquals(false, TakeATenMinuteWalk.solution(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertEquals(false, TakeATenMinuteWalk.solution(new char[] {'w'}));
        assertEquals(false, TakeATenMinuteWalk.solution(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }

    @Test
    public void test2() {
        assertEquals(true, TakeATenMinuteWalk.solution2(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertEquals(false, TakeATenMinuteWalk.solution2(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertEquals(false, TakeATenMinuteWalk.solution2(new char[] {'w'}));
        assertEquals(false, TakeATenMinuteWalk.solution2(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }
}