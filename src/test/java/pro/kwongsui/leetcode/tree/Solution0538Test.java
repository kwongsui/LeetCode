package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0538Test {

    @ParameterizedTest
    @CsvSource({
        "'4,1,6,0,2,5,7,null,null,null,3,null,null,null,8', "
            + "'30,36,21,36,35,26,15,33,8'"
    })
    void convertBST(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            BinaryTree.bfs(new Solution0538().convertBST(BinaryTree.create(input))));
    }
}