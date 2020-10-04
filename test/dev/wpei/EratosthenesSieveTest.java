package dev.wpei;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.List;


class EratosthenesSieveTest {
    @Test
    public void testFindPrimeFactor() {
        int upperBound = 10;
        List<Integer> result = new EratosthenesSieve(upperBound).find();
        assertThat(result, contains(2,3,5,7));
    }

}