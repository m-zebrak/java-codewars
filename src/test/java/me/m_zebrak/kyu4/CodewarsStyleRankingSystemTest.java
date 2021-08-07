package me.m_zebrak.kyu4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodewarsStyleRankingSystemTest {
    CodewarsStyleRankingSystem user;

    @BeforeEach
    public void initialize() {
        user = new CodewarsStyleRankingSystem();
    }

    @Test
    public void newUserCreated() {
        assertEquals(-8, user.rank);
        assertEquals(0, user.progress);
    }

    @Test
    public void progressed() {
        user.incProgress(-7);
        assertEquals(10, user.progress);
        assertEquals(-8, user.rank);
    }

    @Test
    public void illegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> user.incProgress(9));
    }

    @Test
    public void maxRank() {
        user.incProgress(8);
        user.incProgress(8);
        user.incProgress(8);
        assertEquals(0, user.progress);
        assertEquals(8, user.rank);
    }
}