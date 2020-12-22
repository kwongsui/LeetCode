package pro.kwongsui.leetcode.tree;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0117Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,4,5,null,7', '1,#,2,3,#,4,5,7,#'",
        "'1,2,3,4,null,6,7,8,9,null,11', '1,#,2,3,#,4,6,7,#,8,9,11,#'",
        "'1,2,3,4,5,null,6,7,null,null,null,null,8', '1,#,2,3,#,4,5,6,#,7,8,#'",
        "'1,2,3,4,5,6,7,8,9,null,10,11,null,null,12,null,13,null,null,null,null,null,null,null,14', "
            + "'1,#,2,3,#,4,5,6,7,#,8,9,10,11,12,#,13,14,#'"
    })
    void connect(@ConvertWith(IntegerArrayConverter.class) Integer[] input, String output) {
        List<String> expected = Arrays.asList(output.split(","));
        List<String> actual = new Solution0116Test().bfs(
            new Solution0117().connect(BinaryTree.create(input)));
        Assertions.assertIterableEquals(expected, actual);
    }
}