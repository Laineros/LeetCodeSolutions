package Easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ValidParenthesesTest {
    @ParameterizedTest
    @CsvSource({
            "true, ()",
            "true, ()[]{}",
            "false, (]",
            "true, ([])",
            "false, ["
    })
    void isValid(boolean expected,String s) {
        Assertions.assertEquals(expected, new ValidParentheses().isValid(s));
    }
}
