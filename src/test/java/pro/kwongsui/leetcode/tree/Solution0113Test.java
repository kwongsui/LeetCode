package pro.kwongsui.leetcode.tree;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0113Test {

    @ParameterizedTest
    @CsvSource({
        "'5,4,8,11,null,13,4,7,2,null,null,5,1', 22, '5,4,11,2|5,8,4,5'",
        "'1,2,null,3,null,4,null,5', 15, '1,2,3,4,5'"
    })
    void pathSum(
        @ConvertWith(IntegerArrayConverter.class) Integer[] input,
        int sum,
        @ConvertWith(NestedListConverter.class) List<List<Integer>> expected) {
        List<List<Integer>> actual = new Solution0113().pathSum(BinaryTree.create(input), sum);
        Assertions.assertIterableEquals(expected, actual);
    }
}