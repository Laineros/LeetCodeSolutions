package Medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GroupAnagramsTest {
    GroupAnagrams groupAnagrams;
    @BeforeEach
    void setUp() {
        groupAnagrams = new GroupAnagrams();
    }

    @ParameterizedTest
    @MethodSource("groupAnagramsProvide")
    void groupAnagramsTest(List<List<String>> lists, String[] strs) {
        Assertions.assertEquals(lists, groupAnagrams.groupAnagrams(strs));
    }

    static Stream<Object[]> groupAnagramsProvide() {
        return Stream.of(
                new Object[]{Arrays.asList(
                        Arrays.asList("eat", "tea", "ate"),
                        Arrays.asList("bat"),
                        Arrays.asList("tan", "nat")
                ), new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}},
                new Object[]{Arrays.asList(
                        Arrays.asList("")
                ), new String[]{""}},
                new Object[]{Arrays.asList(
                        Arrays.asList("a")
                ), new String[]{"a"}}
        );
    }
}
