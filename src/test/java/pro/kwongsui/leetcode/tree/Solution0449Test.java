package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0449Test {

    @ParameterizedTest
    @CsvSource({
        "'5,3,7,2,4,6,8', 5#3#2#4#7#6#8#",
        "'5,3,7,null,4,6', 5#3#4#7#6#"
    })
    void serialize(@ConvertWith(IntegerArrayConverter.class) Integer[] input, String expected) {
        assertEquals(expected, new Solution0449().serialize(BinaryTree.create(input)));
    }

    @ParameterizedTest
    @CsvSource({
        "5#3#2#4#7#6#8#, '5,3,7,2,4,6,8'",
        "5#3#4#7#6#, '5,3,7,4,6'"
    })
    void deserialize(String data, @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
        TreeNode root = new Solution0449().deserialize(data);
        assertIterableEquals(Arrays.asList(expected), BinaryTree.bfs(root));
    }
}