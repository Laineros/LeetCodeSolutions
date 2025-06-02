package Medium.Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DailyTemperaturesTest {
    @ParameterizedTest
    @MethodSource("testDailyTemperaturesProvide")
    void testDailyTemperatures(int[] expected, int[] dailyTemperatures) {
        Assertions.assertArrayEquals(expected, new DailyTemperatures().dailyTemperatures(dailyTemperatures));
    }
    static Stream<Object[]> testDailyTemperaturesProvide() {
        return Stream.of(
                new Object[]{new int[]{1,1,4,2,1,1,0,0}, new int[]{73,74,75,71,69,72,76,73}},
                new Object[]{new int[]{1,1,1,0}, new int[]{30,40,50,60}},
                new Object[]{new int[]{1,1,0}, new int[]{30,60,90}}
        );
    }
}
