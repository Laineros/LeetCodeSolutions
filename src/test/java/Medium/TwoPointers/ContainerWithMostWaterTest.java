package Medium.TwoPointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {
    @ParameterizedTest
    @MethodSource("maxAreaTestProvider")
    void maxAreaTest(int expected, int[] height) {
        assertEquals(expected, new ContainerWithMostWater().maxArea(height));
    }

    static Stream<Object[]> maxAreaTestProvider() {
        return Stream.of(
                new Object[]{49, new int[] {1,8,6,2,5,4,8,3,7}},
                new Object[]{1, new int[] {1,1}}
        );
    }
}
