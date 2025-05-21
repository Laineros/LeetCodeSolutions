package Medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LongestConsecutiveSequenceTest {
    @ParameterizedTest
    @MethodSource("longestConsecutiveTestProvide")
    void longestConsecutiveTest(int expected, int[] nums) {
        Assertions.assertEquals(expected, LongestConsecutiveSequence.longestConsecutive(nums));
    }
    static Stream<Object[]> longestConsecutiveTestProvide(){
        return Stream.of(
                new Object[]{4, new int[]{100,4,200,1,3,2}},
                new Object[]{9, new int[]{0,3,7,2,5,8,4,6,0,1}},
                new Object[]{3, new int[]{1,0,1,2}}
        );
    }
}
