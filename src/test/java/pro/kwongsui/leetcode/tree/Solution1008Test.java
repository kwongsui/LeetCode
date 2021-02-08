package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1008Test {

    @ParameterizedTest
    @CsvSource({
        "'8,5,1,7,10,12', '8,5,10,1,7,null,12'"
    })
    void bstFromPreorder(@ConvertWith(IntArrayConverter.class) int[] input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        TreeNode actual = new Solution1008().bstFromPreorder(input);
        assertTrue(Solution0894Test.isSameTree(BinaryTree.create(output), actual));
    }
}
