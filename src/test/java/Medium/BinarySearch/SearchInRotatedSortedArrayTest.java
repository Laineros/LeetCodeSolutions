package Medium.BinarySearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedSortedArrayTest {
    @ParameterizedTest
    @MethodSource("searchTestProvider")
    void searchTest(int expected, int[] nums, int target) {
        assertEquals(expected, new SearchInRotatedSortedArray().search(nums, target));
    }
    static Stream<Object[]> searchTestProvider() {
        return Stream.of(
                new Object[]{4, new int[]{4,5,6,7,0,1,2}, 0},
                new Object[]{-1, new int[]{4,5,6,7,0,1,2}, 3},
                new Object[]{-1, new int[]{1}, 0},
                new Object[]{0, new int[]{1}, 1}
        );
    }
}
