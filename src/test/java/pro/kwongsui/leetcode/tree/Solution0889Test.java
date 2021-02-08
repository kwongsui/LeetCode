package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0889Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,4,5,3,6,7', '4,5,2,6,7,3,1', '1,2,3,4,5,6,7'",
        "'2,1', '1,2', '2,1'",
        "'17,4,18,19,7,22,23,20,13,6,16,3,1,2,14,12,11,8,5,10,9,21,15', "
            + "'22,7,3,11,12,8,14,2,9,10,5,1,16,6,15,21,13,20,23,19,18,4,17', " 
            + "'17,4,18,19,7,23,22,20,13,6,21,16,15,3,1,2,5,14,10,12,8,9,11'"
    })
    void constructFromPrePost(@ConvertWith(IntArrayConverter.class) int[] pre,
        @ConvertWith(IntArrayConverter.class) int[] post,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        List<Integer> actual = BinaryTree.bfs(new Solution0889().constructFromPrePost(pre, post));
        assertIterableEquals(Arrays.asList(output), actual);
    }
}