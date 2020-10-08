package dev.wpei;

import java.util.stream.Stream;

public class PopCount {
    public PopCount() {}

    /**
     * show the number of 1 in binary expression of number.
     * Ex. 10(decimal) -> 1010(binary) -> 2
     * @param i
     * @return
     */
    public static int show(int i) {
        String str = Integer.toBinaryString(i);
        int count = 0;
        for(char c: str.toCharArray()) {
            if(c == '1') {
                count++;
            }
        }
        return count;

    }

    public static int count(int i) {
        return Integer.bitCount(i);
    }
}
