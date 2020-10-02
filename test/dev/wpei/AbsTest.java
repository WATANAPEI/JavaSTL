package dev.wpei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsTest {
    @Test
    public void testAbs() {
        int a = -3;
        assertEquals(3, Abs.calcAbs(a));

    }

}