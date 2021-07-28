package me.m_zebrak.kyu5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaginationHelperTest {
    PaginationHelper<Character> helper;

    @BeforeEach
    public void initialize() {
        helper = new PaginationHelper<>(List.of('a', 'b', 'c', 'd', 'e', 'f'), 4);
    }

    @Test
    public void shouldReturnPageCount() {
        assertEquals(2, helper.pageCount());
    }

    @Test
    public void shouldReturnItemCount() {
        assertEquals(6, helper.itemCount());
    }

    @Test
    public void shouldReturnPageItemCount() {
        assertEquals(4, helper.pageItemCount(0));
        assertEquals(2, helper.pageItemCount(1));
        assertEquals(-1, helper.pageItemCount(2));
    }

    @Test
    public void shouldReturnPageIndex() {
        assertEquals(1, helper.pageIndex(5));
        assertEquals(0, helper.pageIndex(2));
        assertEquals(-1, helper.pageIndex(20));
        assertEquals(-1, helper.pageIndex(-10));
    }
}