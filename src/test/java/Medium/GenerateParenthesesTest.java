package Medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class GenerateParenthesesTest {
    @ParameterizedTest
    @MethodSource("testGenerateParenthesesProvide")
    void testGenerateParenthesis(int n, List<String> list) {
        Assertions.assertEquals(list, new GenerateParentheses().generateParenthesis(n));
    }

    static Stream<Object[]> testGenerateParenthesesProvide() {
        return Stream.of(
                new Object[]{3, List.of("((()))", "(()())", "(())()", "()(())", "()()()")},
                new Object[]{1, List.of("()")}
        );
    }
}
