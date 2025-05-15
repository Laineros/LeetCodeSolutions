package Easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RansomNoteTest {
    private RansomNote rn;
    @BeforeEach
    public void init() {
        rn = new RansomNote();
    }
    @ParameterizedTest
    @CsvSource({
            "a, b",
            "aa, ab"
    })
    void testCanConstructFalse(String ransomNote, String magazine) {
        Assertions.assertFalse(rn.canConstruct(ransomNote, magazine));
    }
    @ParameterizedTest
    @CsvSource({
            "aa, aab"
    })
    void testCanConstructTrue(String ransomNote, String magazine) {
        Assertions.assertTrue(rn.canConstruct(ransomNote, magazine));
    }
}
