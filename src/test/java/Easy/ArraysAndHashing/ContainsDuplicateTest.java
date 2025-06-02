package Easy.ArraysAndHashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ContainsDuplicateTest {
    private ContainsDuplicate cdn;
    @BeforeEach
    public void setUp() {
        cdn = new ContainsDuplicate();
    }
    @ParameterizedTest
    @MethodSource("provideIntArrs")
    void testContainsDuplicateTrue(int[] nums) {
        Assertions.assertEquals(true, cdn.containsDuplicate(nums));
    }
    @Test
    void testContainsDuplicateFalse() {
        Assertions.assertEquals(false, cdn.containsDuplicate(new int[]{1,2,3,4}));
    }
    static Stream<int[]> provideIntArrs() {
        return Stream.of(
                new int[]{1,2,3,1},
                new int[]{1,1,1,3,3,4,3,2,4,2}
        );
    }
}
