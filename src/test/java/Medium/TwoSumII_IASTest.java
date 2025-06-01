package Medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumII_IASTest {

    @ParameterizedTest
    @MethodSource("twoSumTestProvide")
    void twoSumTest(int[] expected, int[] numbers, int target) {
        assertArrayEquals(expected, new TwoSumII_IAS().twoSum(numbers, target));
    }

    static Stream<Object[]> twoSumTestProvide() {
        return Stream.of(
                new Object[]{new int[]{1,2}, new int[]{2,7,11,15}, 9},
                new Object[]{new int[]{1,3}, new int[]{2,3,4}, 6},
                new Object[]{new int[]{1,2}, new int[]{-1, 0}, -1}
        );
    }
}
