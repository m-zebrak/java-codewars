package me.m_zebrak.kyu5;

/**
 * When working with color values it can sometimes be useful to extract the individual red, green, and blue (RGB) component values for a color. Implement a function that meets these requirements:
 * <p>
 * Accepts a case-insensitive hexadecimal color string as its parameter (ex. "#FF9933" or "#ff9933")
 * Returns an object with the structure {r: 255, g: 153, b: 51} where r, g, and b range from 0 through 255
 * Note: your implementation does not need to support the shorthand form of hexadecimal notation (ie "#FFF")
 * <p>
 * Example
 * "#FF9933" --> {r: 255, g: 153, b: 51}
 */
public class ConvertAHexStringToRGB {
    public static int[] solution(String hex) {
        return new int[]{Integer.parseInt(hex.substring(1, 3), 16),
                         Integer.parseInt(hex.substring(3, 5), 16),
                         Integer.parseInt(hex.substring(5, 7), 16)};
    }
}
