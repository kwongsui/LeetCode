package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1104Test {

    @ParameterizedTest
    @CsvSource({
        "14, '1,3,4,14'",
        "26, '1,2,6,10,26'"
    })
    void pathInZigZagTree(int input, @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output), new Solution1104().pathInZigZagTree(input));
    }
}