package Hard.Stack.TwoPointers;

import Hard.TwoPointers.TrappingRainWater;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {
    @ParameterizedTest
    @MethodSource("trapTestProvider")
    void trapTest(int expected, int[] height) {
        assertEquals(expected, new TrappingRainWater().trap(height));
    }
    static Stream<Object[]> trapTestProvider() {
        return Stream.of(
                new Object[]{6, new int[]{0,1,0,2,1,0,1,3,2,1,2,1}},
                new Object[]{9, new int[]{4,2,0,3,2,5}}
        );
    }
}
