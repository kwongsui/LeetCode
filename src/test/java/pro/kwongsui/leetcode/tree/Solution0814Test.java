package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0814Test {

    @ParameterizedTest
    @CsvSource({
        "'1,null,0,0,1', '1,0,1'",
        "'1,0,1,0,0,0,1', '1,1,1'",
        "'1,1,0,1,1,0,1,0', '1,1,0,1,1,1'"
    })
    void pruneTree(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            BinaryTree.bfs(new Solution0814().pruneTree1(BinaryTree.create(input))));
    }
}