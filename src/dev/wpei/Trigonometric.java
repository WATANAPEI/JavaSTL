package dev.wpei;

public class Trigonometric {
    Trigonometric() {}
    public static double sin(double d) {
        return Math.sin(d);
    }

    public static double sinByDegree(double d) {
        return Math.sin(d * Math.PI / 180.0);
    }

}
