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

    @Test
    public void testIntToBitSet() {
        int num = 12;
        System.out.println(Integer.toBinaryString(num));
        int num2 = num | 2;
        System.out.println(Integer.toBinaryString(num2));
    }

    @Test
    public void testBitCount() {
        int i = 211;
        // transform int to Binary form String
        System.out.println(Integer.toBinaryString(i));
        // count number of 1(true) bit
        System.out.println(Integer.bitCount(i));
        // set 1 on specified digit
        System.out.println(Integer.toBinaryString(i | 1 << 3));
        // set 0 on specified digit
        System.out.println(Integer.toBinaryString(i | 0 << 0));
    }

}