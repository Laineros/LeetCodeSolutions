package Easy.BinarySearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @ParameterizedTest
    @MethodSource("searchTestProvider")
    void searchTest(int epxected, int[] nums, int target) {
        assertEquals(epxected, new BinarySearch().search(nums, target));
    }
    static Stream<Object[]> searchTestProvider() {
        return Stream.of(
                new Object[] {4, new int[] {-1,0,3,5,9,12}, 9},
                new Object[] {-1, new int[] {-1,0,3,5,9,12}, 2}
        );
    }
}
