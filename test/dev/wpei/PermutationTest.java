package dev.wpei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {
    @Test
    public void testPermutationGenerate() {
        Permutation p = new Permutation();
        p.generate("abc", "").stream()
                .forEach(e->System.out.println(e));

    }

}