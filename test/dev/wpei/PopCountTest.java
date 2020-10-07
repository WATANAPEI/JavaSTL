package dev.wpei;

import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.util.BitSet;

import static org.junit.jupiter.api.Assertions.*;

class PopCountTest {
    @Test
    public void testBitShift() {
        int i = 10;
        System.out.printf("%-12s:%10d\n", "Num", i);
        System.out.printf("%-12s:%10s\n", "Num(Binary)", Integer.toBinaryString(i));
        System.out.printf("%-12s:%10d\n", "PopCount", PopCount.show(i));
    }
    @Test
    public void testBitSet() {
        int i = 10 << 1;
        System.out.printf("%-12s:%10d\n", "Num", i);
        System.out.printf("%-12s:%10s\n", "Num(Binary)", Integer.toBinaryString(i));
        System.out.printf("%-12s:%10d\n", "PopCount", PopCount.show(i));
        System.out.println(i << 1);
    }

}