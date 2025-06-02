package Easy.TwoPointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPalindromeTest {
    ValidPalindrome vp;
    @BeforeEach
    void setUp() {
        vp = new ValidPalindrome();
    }

    @ParameterizedTest
    @MethodSource("validPalindromeProvide")
    void validPalindromeTest(boolean expected, String input) {
        assertEquals(expected, vp.validPalindrome(input));
    }

    static Stream<Object[]> validPalindromeProvide() {
        return Stream.of(
                new Object[]{true, "A man, a plan, a canal: Panama"},
                new Object[]{true, "A man, a plan, a ccanal: Panama"},
                new Object[]{false, "race a car"},
                new Object[]{true, " "}
        );
    }
}
