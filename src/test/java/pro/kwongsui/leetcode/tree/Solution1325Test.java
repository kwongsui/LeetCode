package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1325Test {

    @ParameterizedTest
    @CsvSource({
        "'1,3,3,3,2', 3, '1,3,2'",
        "'1,2,null,2,null,2', 2, '1'",
        "'1,1,1', 1, ''",
        "'1,2,3', 1, '1,2,3'",
        "'', 1, ''"
    })
    void removeLeafNodes(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        int target, @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            BinaryTree.bfs(new Solution1325().removeLeafNodes(BinaryTree.create(input), target)));
    }
}