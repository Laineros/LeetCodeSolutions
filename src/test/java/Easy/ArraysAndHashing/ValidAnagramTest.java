package Easy.ArraysAndHashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ValidAnagramTest {
    @ParameterizedTest
    @CsvSource({
            "true, anagram, nagaram",
            "false, rat, car"
    })
    void isAnagramTest(boolean exp, String s, String t) {
        Assertions.assertEquals(exp, new ValidAnagram().isAnagram(s, t));
    }
}
