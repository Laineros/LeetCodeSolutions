package Medium.BinarySearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchA2DMatrixTest {
    @ParameterizedTest
    @MethodSource("searchMatrixTestProvider")
    void searchMatrixTest(boolean expected, int[][] matrix, int target) {
        assertEquals(expected, new SearchA2DMatrix().searchMatrix(matrix, target));
    }

    static Stream<Object[]> searchMatrixTestProvider() {
        return Stream.of(
                new Object[]{true, new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 3},
                new Object[]{false, new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 13}
        );
    }
}
