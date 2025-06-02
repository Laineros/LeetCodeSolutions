package Easy.TwoPointers;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleОfTheLinkedListTest {
    private final MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();

    @ParameterizedTest
    @MethodSource("provideLists")
    void testMiddleNode(ListNode input, ListNode expected) {
        ListNode result = solution.middleNode(input);
        assertEquals(expected.val, result.val);
    }

    static Stream<Arguments> provideLists() {
        return Stream.of(
                Arguments.of(
                        createList(new int[]{1, 2, 3, 4, 5}),
                        new ListNode(3)
                ),
                Arguments.of(
                        createList(new int[]{1, 2, 3, 4, 5, 6}),
                        new ListNode(4)
                )
        );
    }

    private static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }
}
