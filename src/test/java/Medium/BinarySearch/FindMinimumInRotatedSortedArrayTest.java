package Medium.BinarySearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumInRotatedSortedArrayTest {
    @ParameterizedTest
    @MethodSource("findMinTestProvider")
    void findMinTest(int expected, int[] nums) {
        assertEquals(expected, new FindMinimumInRotatedSortedArray().findMin(nums));
    }

    static Stream<Object[]> findMinTestProvider() {
        return Stream.of(
                new Object[] {1, new int[]{3,4,5,1,2}},
                new Object[] {0, new int[]{4,5,6,7,0,1,2}},
                new Object[] {11, new int[]{11,13,15,17}},
                new Object[] {1, new int[]{1,2}}
        );
    }
}
