package programmers.level1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {
    private final ReverseString solution = new ReverseString();

    @Test
    void testBasicCase() {
        assertEquals("olleh", solution.solution("hello"));
    }

    @Test
    void testWithCapitalLetter() {
        assertEquals("dlroW", solution.solution("World"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("a", solution.solution("a"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", solution.solution(""));
    }

    @Test
    void testLongString() {
        assertEquals("dcba", solution.solution("abcd"));
    }
} 