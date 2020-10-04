package dev.wpei;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class TrigonometricTest {

    @Test
    public void testSin() {
        Double rad = Math.PI / 6;
        BigDecimal bd = new BigDecimal(Trigonometric.sin(rad));
        MathContext mc = new MathContext(1, RoundingMode.HALF_UP);
        assertEquals(BigDecimal.ONE.divide(new BigDecimal(2)), bd.round(mc));
    }

    @Test
    public void testDegreeInput() {
        double deg = 90;
        BigDecimal bd = new BigDecimal(Trigonometric.sinByDegree(deg));
        assertEquals(BigDecimal.ONE, bd);
        assertEquals(BigDecimal.ONE,
                new BigDecimal(Math.sin(Math.toRadians(deg))).round(new MathContext(1, RoundingMode.HALF_UP)));
    }

    @Test
    public void testArcTan() {
        double a = Math.atan2(1,1);
        System.out.println(a);
    }

}