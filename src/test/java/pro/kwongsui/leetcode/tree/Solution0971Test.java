package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0971Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2', '2,1', '-1'",
        "'1,2,3', '1,3,2', '1'",
        "'1,2,3', '1,2,3', ''",
        "'1,2,3,4,5,6,7', '1,2,4,5,3,6,7', ''",
        "'0,2,3', '1,2,3', '-1'",
        "'1,2,3,4,5,6,null,null,null,7,8', '1,3,6,2,4,5,8,7', '1,5'",
        "'1,2,3,4,5,7,6', '1,2,4,0,3,6,7', '-1'",
        "'1,2,3,4,5,7,6', '1,2,5,4,3,6,0', '-1'",
        "'1,null,2,null,3', '1,3,2', '-1'"
    })
    void flipMatchVoyage(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntArrayConverter.class) int[] voyage,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            new Solution0971().flipMatchVoyage(BinaryTree.create(input), voyage));
    }
}