package Medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TopKFrequentElementsTest {
    TopKFrequentElements topKFrequentElements;
    @BeforeEach
    void setUp() {
        topKFrequentElements = new TopKFrequentElements();
    }

    @ParameterizedTest
    @MethodSource("topKFrequentProvide")
    void topKFrequentTest(int[] expected, int[] nums, int k) {
        Assertions.assertArrayEquals(expected, topKFrequentElements.topKFrequent(nums, k));
    }
    static Stream<Object[]> topKFrequentProvide() {
        return Stream.of(
                new Object[]{new int[]{1,2}, new int[]{1,1,1,2,2,3}, 2},
                new Object[]{new int[]{1}, new int[]{1}, 1},
                new Object[]{new int[]{3,4,1}, new int[]{1,1,1,2,2,3,3,3,3,3,4,4,4,56,4}, 3}
        );
    }
}
