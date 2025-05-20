package Medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ProductOfArrayExceptSelfTest {

    @ParameterizedTest
    @MethodSource("productExceptSelfTestProvide")
    void productExceptSelfTest(int[] expected, int[] nums) {
        Assertions.assertArrayEquals(expected, new ProductOfArrayExceptSelf().productExceptSelf(nums));
    }

    static Stream<Object[]> productExceptSelfTestProvide() {
        return Stream.of(
                new Object[]{new int[]{24,12,8,6}, new int[]{1,2,3,4}},
                new Object[]{new int[]{0,0,9,0,0}, new int[]{-1,1,0,-3,3}}
        );
    }
}
