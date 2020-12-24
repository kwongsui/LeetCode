package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0508Test {

    @ParameterizedTest
    @CsvSource({
        "'', ''",
        "'5,2,-3', '-3,2,4'",
        "'5,2,-5', '2'"
    })
    void findFrequentTreeSum(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntArrayConverter.class) int[] expected) {
        int[] actual = new Solution0508().findFrequentTreeSum(BinaryTree.create(input));
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}