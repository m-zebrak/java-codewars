package me.m_zebrak.kyu4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationsTest {
    @Test
    public void example1() {
        assertEquals(new ArrayList<>(Arrays.asList("a")),
                     Permutations.solution("a").stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void example2() {
        assertEquals(new ArrayList<>(Arrays.asList("ab", "ba")),
                     Permutations.solution("ab").stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void example3() {
        assertEquals(new ArrayList<>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                     Permutations.solution("aabb").stream().sorted().collect(Collectors.toList()));
    }
}