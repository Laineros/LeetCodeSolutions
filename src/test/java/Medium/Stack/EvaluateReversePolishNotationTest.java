package Medium.Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EvaluateReversePolishNotationTest {
    @ParameterizedTest
    @MethodSource("testEvalRPNProvide")
    void evalRPN(int exp, String[] tokens) {
        Assertions.assertEquals(exp, new EvaluateReversePolishNotation().evalRPN(tokens));
    }

    static Stream<Object[]> testEvalRPNProvide() {
        return Stream.of(
                new Object[]{9, new String[]{"2","1","+","3","*"}},
                new Object[]{6, new String[]{"4","13","5","/","+"}},
                new Object[]{22, new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}}
        );
    }
}
