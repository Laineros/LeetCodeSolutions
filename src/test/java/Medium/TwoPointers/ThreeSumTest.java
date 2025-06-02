package Medium.TwoPointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {

    @ParameterizedTest
    @MethodSource("threeSumTestProvider")
    void threeSumTest(List<List<Integer>> expected, int[] nums) {
        assertEquals(expected, new ThreeSum().threeSum(nums));
    }
    static Stream<Object[]> threeSumTestProvider() {
        return Stream.of(
                new Object[] {
                    List.of(
                        Arrays.asList(-1, -1, 2),
                        Arrays.asList(-1, 0, 1)
                ),
                        new int[] {-1, 0, 1, 2, -1, -4}},
                new Object[] {
                    new ArrayList<>(),
                        new int[] {0, 1, 1}},
                new Object[] {
                        List.of(
                                Arrays.asList(0, 0, 0)
                        ),
                        new int[] {0, 0, 0}}
        );
    }
}
