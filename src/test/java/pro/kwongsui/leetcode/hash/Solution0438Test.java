package pro.kwongsui.leetcode.hash;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0438Test {

    @ParameterizedTest
    @CsvSource({
        "cbaebabacd, abc, '0,6'",
        "abab, ab, '0,1,2'",
    })
    void findAnagrams(String s, String p,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output), new Solution0438().findAnagrams(s, p));
    }
}