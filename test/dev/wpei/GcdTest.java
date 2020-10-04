package dev.wpei;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

class GcdTest {
    @Test
    public void testGcd() {
        //assertEquals(7, Gcd.calc(21, 7));
        assertThat(7, is(Gcd.calc(21,7)));
    }
}

class LcmTest {
    @Test
    public void testLcm() {
        assertThat(210, is(Lcm.calc(30, 42)));
    }
}
