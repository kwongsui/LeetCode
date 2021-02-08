package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0998Test {

    @ParameterizedTest
    @CsvSource({
        "'4,1,3,null,null,2', 5, '5,4,1,3,2'",
        "'5,2,4,null,1', 3, '5,2,4,1,3'",
        "'5,2,3,null,1', 4, '5,2,4,1,3'",
        "'6', 5, '6,5'",
        "'', 5, '5'",
        "'5', 6, '6,5'"
    })
    void insertIntoMaxTree(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int val,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            BinaryTree.bfs(new Solution0998().insertIntoMaxTree(BinaryTree.create(input), val)));
    }
}