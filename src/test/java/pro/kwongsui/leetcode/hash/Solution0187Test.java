package pro.kwongsui.leetcode.hash;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0187Test {

    @ParameterizedTest
    @CsvSource({
        "'AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT', 'AAAAACCCCC,CCCCCAAAAA'",
        "'AAAAAAAAAAAAA', 'AAAAAAAAAA'"
    })
    void findRepeatedDnaSequences(String input, String expected) {
        assertIterableEquals(Arrays.asList(expected.split(",")),
            new Solution0187().findRepeatedDnaSequences(input));
    }
}