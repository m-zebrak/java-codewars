package me.m_zebrak.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreatePhoneNumberTest {
    @Test
    public void tests() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}