package me.m_zebrak.kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ConvertAHexStringToRGBTest {
    @Test
    public void allOne() {
        assertArrayEquals(ConvertAHexStringToRGB.solution("#111111"), new int[]{17, 17, 17});
    }

    @Test
    public void allZero() {
        assertArrayEquals(ConvertAHexStringToRGB.solution("#000000"), new int[]{0, 0, 0});
    }

    @Test
    public void more() {
        assertArrayEquals(ConvertAHexStringToRGB.solution("#FF9933"), new int[]{255, 153, 51});
        assertArrayEquals(ConvertAHexStringToRGB.solution("#beaded"), new int[]{190, 173, 237});
        assertArrayEquals(ConvertAHexStringToRGB.solution("#Fa3456"), new int[]{250, 52, 86});
    }
}