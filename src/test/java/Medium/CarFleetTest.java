package Medium;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFleetTest {
    CarFleet carFleet;
    @BeforeEach
    void setUp() {
        carFleet = new CarFleet();
    }
    @ParameterizedTest
    @MethodSource("testCarFleetProvide")
    void testCarFleet(int expected, int target, int[] position, int[] speed) {
        assertEquals(expected, carFleet.carFleet(target, position, speed));
    }
    static Stream<Object[]> testCarFleetProvide() {
        return Stream.of(
                new Object[]{3, 12, new int[] {10,8,0,5,3}, new int[] {2,4,1,1,3}},
                new Object[]{1, 10, new int[] {3}, new int[] {3}},
                new Object[]{1, 100, new int[] {0,2,4}, new int[] {4,2,1}}
        );
    }
}
