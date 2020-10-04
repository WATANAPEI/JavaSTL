package dev.wpei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {
    @Test
    public void testMin() {
        assertEquals(3, Math.min(3,4));
    }
    @Test
    public void testMax() {
        assertEquals(4, Math.max(4,1));
    }

    @Test
    public void testMinMultiArgs() {
        int[] a = {1, 5, 9, 2, 4, 1};
        assertEquals(1, MinMax.myMin(a));
    }


}