package Medium.BinarySearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KokoEatingBananasTest {
    @ParameterizedTest
    @MethodSource("minEatingSpeedTestProvider")
    void minEatingSpeedTest(int expected, int[] piles, int h) {
        assertEquals(expected, new KokoEatingBananas().minEatingSpeed(piles, h));
    }

    static Stream<Object> minEatingSpeedTestProvider() {
        return Stream.of(
                new Object[] {4, new int[]{3,6,7,11}, 8},
                new Object[] {30, new int[]{30,11,23,4,20}, 5},
                new Object[] {23, new int[]{30,11,23,4,20}, 6}
        );
    }
}
