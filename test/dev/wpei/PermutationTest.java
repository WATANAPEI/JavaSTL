package dev.wpei;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

class PermutationTest {
    @Test
    public void testPermutationGenerate() {
        Permutation p = new Permutation();
        List<String> result = p.generate("abc", "");
        assertThat(result, contains("abc", "acb", "bac", "bca", "cab", "cba"));
    }
}