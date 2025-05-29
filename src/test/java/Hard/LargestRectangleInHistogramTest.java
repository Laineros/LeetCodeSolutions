package Hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestRectangleInHistogramTest {
    LargestRectangleInHistogram rectangle;
    @BeforeEach
    void setUp() {
        rectangle = new LargestRectangleInHistogram();
    }
    @Test
    void testLargestRectangleArea() {
        assertEquals(10, rectangle.largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
    @Test
    void testLargestRectangleArea2() {
        assertEquals(4, rectangle.largestRectangleArea(new int[]{2,4}));
    }
}
