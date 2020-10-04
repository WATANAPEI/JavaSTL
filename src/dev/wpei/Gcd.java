package dev.wpei;

public class Gcd {
    public Gcd() {}

    public static int calc(int dividend, int divisor) {
        if(divisor == 0) return dividend;
        return calc(divisor, dividend%divisor);
    }
}

class Lcm {
    public Lcm() {}

    public static int calc(int a, int b) {
        return a * b / Gcd.calc(a, b);
    }
}
