package Easy.Diff;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class NumberOfStepsToReduceANumberToZeroTest {
    @ParameterizedTest
    @CsvSource({
            "6, 14",
            "4, 8",
            "12, 123"
    })
    public void numberOfStepsTest(int excepted, int actual) {
        assertEquals(excepted, NumberOfStepsToReduceANumberToZero.numberOfSteps(actual));
    }
}
