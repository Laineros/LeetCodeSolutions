package Easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TwoSumTest {
    @ParameterizedTest
    @MethodSource("twoSumTestProvide")
    void twoSumTest(int[] exp, int[] nums, int target) {
        Assertions.assertArrayEquals(exp, new TwoSum().twoSum(nums, target));
    }
    static Stream<Object[]> twoSumTestProvide() {
        return Stream.of(
                new Object[]{new int[]{0,1},new int[]{2,7,11,15}, 9},
                new Object[]{new int[]{1,2},new int[]{3,2,4}, 6},
                new Object[]{new int[]{0,1},new int[]{3,3}, 6});
    }
}
