package programmers.level1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfDigitsTest {
    private final SumOfDigits solution = new SumOfDigits();

    @Test
    void testBasicCase() {
        assertEquals(6, solution.solution(123));
    }

    @Test
    void testLargeNumber() {
        assertEquals(24, solution.solution(987));
    }

    @Test
    void testSingleDigit() {
        assertEquals(5, solution.solution(5));
    }

    @Test
    void testZero() {
        assertEquals(0, solution.solution(0));
    }

    @Test
    void testLargeInput() {
        assertEquals(28, solution.solution(1234567));
    }
} 