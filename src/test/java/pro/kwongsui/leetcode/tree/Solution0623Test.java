package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0623Test {

    @ParameterizedTest
    @CsvSource({
        "'4,2,6,3,1,5', 1, 2, '4,1,1,2,6,3,1,5'",
        "'4,null,2,3,1', 1, 3, '4,2,1,1,3,1'",
        "'4,null,2,3,1', 1, 4, '4,2,3,1,1,1,1,1'",
        "'4,2,6,3,1,5,7,null,10,8,null,null,9,11', 2, 4, '4,2,6,3,1,5,7,2,2,2,2,2,2,2,2,10,8,9,11'"
    })
    void addOneRow(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        int v, int d, @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
        assertIterableEquals(Arrays.asList(expected),
            BinaryTree.bfs(new Solution0623().addOneRow(BinaryTree.create(input), v, d)));
    }
}