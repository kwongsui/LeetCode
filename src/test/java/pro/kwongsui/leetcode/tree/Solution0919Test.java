package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.tree.Solution0919.CBTInserter;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0919Test {

    @ParameterizedTest
    @CsvSource({
        "'1', '2', '1,2'",
        "'1,2,3,4,5,6', '7,8', '1,2,3,4,5,6,7,8'"
    })
    void test(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntArrayConverter.class) int[] values,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        CBTInserter cbtInserter = new CBTInserter(BinaryTree.create(input));
        for (int val : values) {
            cbtInserter.insert(val);
        }
        assertIterableEquals(Arrays.asList(output), BinaryTree.bfs(cbtInserter.get_root()));
    }
}
